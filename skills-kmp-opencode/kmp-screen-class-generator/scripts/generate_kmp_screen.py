#!/usr/bin/env python3
"""Scaffold KMP screen classes by screen name."""

from __future__ import annotations

import argparse
import re
from pathlib import Path


def to_pascal(value: str) -> str:
    parts = re.split(r"[^A-Za-z0-9]+", value)
    cleaned = [p for p in parts if p]
    if not cleaned:
        raise ValueError("screen name must contain letters or digits")
    return "".join(word[:1].upper() + word[1:] for word in cleaned)


def to_feature_name(value: str) -> str:
    value = re.sub(r"(.)([A-Z][a-z]+)", r"\1_\2", value)
    value = re.sub(r"([a-z0-9])([A-Z])", r"\1_\2", value)
    value = re.sub(r"[^A-Za-z0-9]+", "_", value)
    value = re.sub(r"_+", "_", value)
    value = value.strip("_").lower()
    if not value:
        raise ValueError("feature name cannot be empty")
    return value


def path_from_package(package_name: str) -> str:
    if not re.fullmatch(r"[A-Za-z_][A-Za-z0-9_]*(\.[A-Za-z_][A-Za-z0-9_]*)*", package_name):
        raise ValueError("invalid package format")
    return package_name.replace(".", "/")


def write_file(path: Path, content: str, overwrite: bool) -> bool:
    if path.exists() and not overwrite:
        return False
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")
    return True


def kt_state(package_name: str, feature_slug: str, screen: str) -> str:
    return f'''package {package_name}.feature.{feature_slug}.list

import com.example.kursovikkmp.base.BaseViewState
import com.example.kursovikkmp.common.view.TitleBarState
import com.example.kursovikkmp.common.view.getMock

data class {screen}State(
    override val titleBarState: TitleBarState = TitleBarState.getMock(),
    val items: List<{screen}ItemUiState> = emptyList(),
    val searchQuery: String = "",
) : BaseViewState {{
    companion object {{
        fun getMock() = {screen}State(
            items = listOf({screen}ItemUiState.getMock())
        )
    }}
}}

data class {screen}ItemUiState(
    val id: String = "",
    val title: String = "",
) {{
    companion object {{
        fun getMock() = {screen}ItemUiState(
            id = "1",
            title = "{screen} item",
        )
    }}
}}
'''


def kt_events(package_name: str, feature_slug: str, screen: str) -> str:
    return f'''package {package_name}.feature.{feature_slug}.list

import com.example.kursovikkmp.base.BaseEvent

sealed class {screen}Events : BaseEvent {{
    data class OnItemClicked(val id: String) : {screen}Events()
    data class OnSearchQueryChanged(val query: String) : {screen}Events()
    data object OnRetryClicked : {screen}Events()
}}
'''


def kt_viewmodel(package_name: str, feature_slug: str, screen: str) -> str:
    return f'''package {package_name}.feature.{feature_slug}.list

import com.example.kursovikkmp.base.BaseViewModel

class {screen}ViewModel(
    // TODO: add dependencies
) : BaseViewModel<{screen}State, {screen}Events>() {{

    override fun initToolbar() {{
        // TODO: configure toolbar title/state
    }}

    override fun initScreenData() {{
        updateState {{ copy(items = listOf({screen}ItemUiState.getMock())) }}
    }}

    override fun initialState(): {screen}State = {screen}State()

    override fun onEvent(event: {screen}Events) {{
        when (event) {{
            is {screen}Events.OnItemClicked -> {{
                // TODO: handle item click
            }}

            is {screen}Events.OnSearchQueryChanged -> {{
                updateState {{ copy(searchQuery = event.query) }}
            }}

            {screen}Events.OnRetryClicked -> {{
                initScreenData()
            }}
        }}
    }}
}}
'''


def kt_compose(package_name: str, feature_slug: str, screen: str) -> str:
    android_package = f"{package_name}.feature_{feature_slug}"
    shared_package = f"{package_name}.feature.{feature_slug}.list"
    return f'''package {android_package}

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.core.BaseScreen
import com.example.core.Toolbar
import org.koin.androidx.compose.koinViewModel
import {shared_package}.{screen}Events
import {shared_package}.{screen}State
import {shared_package}.{screen}ViewModel

@Composable
fun {screen}Screen() {{
    val viewModel: {screen}ViewModel = koinViewModel()
    val state by viewModel.flowState.collectAsState()
    val lceState by viewModel.lceState.collectAsState()

    BaseScreen(
        lceState = lceState,
        onDefaultUiEvent = viewModel::onDefaultUiEvent
    ) {{
        {screen}ScreenView(
            state = state,
            onUiEvent = viewModel::pushEvent
        )
    }}
}}

@Composable
fun {screen}ScreenView(
    state: {screen}State,
    onUiEvent: ({screen}Events) -> Unit
) {{
    Column(modifier = Modifier.fillMaxSize()) {{
        Toolbar(toolbarState = state.titleBarState)
        OutlinedTextField(
            value = state.searchQuery,
            onValueChange = {{ onUiEvent({screen}Events.OnSearchQueryChanged(it)) }},
            label = {{ Text("Search") }}
        )

        state.items.forEach {{ item ->
            Text(
                text = item.title,
                modifier = Modifier,
            )
        }}
    }}
}}
'''


def kt_test(package_name: str, feature_slug: str, screen: str) -> str:
    return f'''package {package_name}.feature.{feature_slug}.list

import kotlin.test.Test
import kotlin.test.assertTrue

class {screen}ViewModelCommonTest {{

    @Test
    fun placeholderTest() {{
        // TODO: replace with real tests for state/events/navigation
        assertTrue(true)
    }}
}}
'''


def swift_actions(screen: str) -> str:
    return f'''import Foundation

enum {screen}ViewActions {{
    case itemTapped(String)
    case searchChanged(String)
}}
'''


def swift_module_input(screen: str) -> str:
    return f'''import Foundation

struct {screen}ConfigData {{
}}

protocol {screen}ModuleInput: AnyObject {{
    func configure(data: {screen}ConfigData)
}}
'''


def swift_viewmodel(screen: str) -> str:
    return f'''import Foundation
import shared

final class {screen}ViewModel: BaseViewModel<shared.{screen}ViewModel, {screen}State> {{

    required override init() {{
        super.init()
    }}

    func onEvent(event: {screen}ViewActions) {{
        switch event {{
        case .itemTapped(let id):
            mViewModel?.pushEvent(event: .OnItemClicked(id: id))
        case .searchChanged(let query):
            mViewModel?.pushEvent(event: .OnSearchQueryChanged(query: query))
        }}
    }}
}}

extension {screen}ViewModel: {screen}ModuleInput {{
    func configure(data: {screen}ConfigData) {{
        // TODO: configure screen from parent module
    }}
}}
'''


def swift_view(screen: str) -> str:
    return f'''import SwiftUI

struct {screen}View: View {{
    @StateObject private var viewModel = {screen}ViewModel()

    var body: some View {{
        VStack(spacing: 12) {{
            TextField(
                "Search",
                text: Binding(
                    get: {{ viewModel.state.searchQuery }},
                    set: {{ viewModel.onEvent(event: .searchChanged($0)) }}
                )
            )
            .textFieldStyle(.roundedBorder)

            List(0..<viewModel.state.items.count, id: \\.self) {{ index in
                let item = viewModel.state.items[index]
                Text(item.title)
                    .onTapGesture {{
                        viewModel.onEvent(event: .itemTapped(item.id))
                    }}
            }}
        }}
        .padding(16)
        .onAppear {{
            viewModel.sendViewAppearedEvent()
        }}
    }}
}}

#Preview {{
    {screen}View()
}}
'''


def main() -> int:
    parser = argparse.ArgumentParser(description="Generate KMP screen skeleton files")
    parser.add_argument("--screen", required=True, help="Screen name, e.g. Profile or NewsList")
    parser.add_argument("--package", required=True, help="Base Kotlin package, e.g. com.example.app")
    parser.add_argument("--output", default=".", help="Project root directory")
    parser.add_argument("--feature-name", default="", help="Feature folder slug override")
    parser.add_argument("--overwrite", action="store_true", help="Overwrite existing files")
    parser.add_argument("--no-ios", action="store_true", help="Skip iOS Swift files")
    parser.add_argument("--no-android", action="store_true", help="Skip Android Compose screen")
    parser.add_argument("--no-tests", action="store_true", help="Skip shared commonTest file")
    args = parser.parse_args()

    try:
        screen = to_pascal(args.screen)
        feature_slug = to_feature_name(args.feature_name) if args.feature_name else to_feature_name(screen)
        package_path = path_from_package(args.package)
    except ValueError as exc:
        print(f"error: {exc}")
        return 1

    root = Path(args.output).resolve()

    shared_main = root / "shared" / feature_slug / "src" / "commonMain" / "kotlin" / package_path / "feature" / feature_slug / "list"
    shared_test = root / "shared" / feature_slug / "src" / "commonTest" / "kotlin" / package_path / "feature" / feature_slug / "list"
    android_dir = root / "androidApp" / f"feature_{feature_slug}" / "src" / "main" / "java" / package_path / f"feature_{feature_slug}"
    ios_vm_dir = root / "iosApp" / "iosApp" / "Screens" / screen / "ViewModel"
    ios_view_dir = root / "iosApp" / "iosApp" / "Screens" / screen / "View"

    files = {
        shared_main / f"{screen}State.kt": kt_state(args.package, feature_slug, screen),
        shared_main / f"{screen}Events.kt": kt_events(args.package, feature_slug, screen),
        shared_main / f"{screen}ViewModel.kt": kt_viewmodel(args.package, feature_slug, screen),
    }

    if not args.no_tests:
        files[shared_test / f"{screen}ViewModelCommonTest.kt"] = kt_test(args.package, feature_slug, screen)

    if not args.no_android:
        files[android_dir / f"{screen}Screen.kt"] = kt_compose(args.package, feature_slug, screen)

    if not args.no_ios:
        files[ios_vm_dir / f"{screen}ViewActions.swift"] = swift_actions(screen)
        files[ios_vm_dir / f"{screen}ModuleInput.swift"] = swift_module_input(screen)
        files[ios_vm_dir / f"{screen}ViewModel.swift"] = swift_viewmodel(screen)
        files[ios_view_dir / f"{screen}View.swift"] = swift_view(screen)

    created = []
    skipped = []
    for path, content in files.items():
        changed = write_file(path, content, overwrite=args.overwrite)
        if changed:
            created.append(path)
        else:
            skipped.append(path)

    print(f"screen: {screen}")
    print(f"feature: {feature_slug}")
    print(f"package: {args.package}")
    print("")
    print("created files:")
    for path in created:
        print(f"  - {path}")

    if skipped:
        print("")
        print("skipped existing files (use --overwrite):")
        for path in skipped:
            print(f"  - {path}")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
