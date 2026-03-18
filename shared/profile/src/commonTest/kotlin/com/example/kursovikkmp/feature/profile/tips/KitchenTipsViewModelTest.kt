package com.example.kursovikkmp.feature.profile.tips

import com.example.kursovikkmp.MR
import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class KitchenTipsViewModelTest {

    private lateinit var viewModel: KitchenTipsViewModel
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        startKoin {
            modules(
                module {
                    single<NavigationService> { NavigationServiceFake() }
                    single<ResourceService> { ResourceServiceFake() }
                    single<DeviceService> { DeviceServiceFake() }
                    factory { LceStateManager() }
                }
            )
        }

        viewModel = KitchenTipsViewModel()
    }

    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
        stopKoin()
    }

    @Test
    fun initialState_containsHeroChecklistAndCards() = runTest {
        viewModel.initScreenData()

        val state = viewModel.state
        assertEquals("Plan three dinners, not seven", state.heroTitle)
        assertEquals(3, state.checklist.size)
        assertEquals(3, state.tipCards.size)
        assertEquals("Sunday reset", state.tipCards.first().title)
    }

    private class NavigationServiceFake : NavigationService {
        private val _currentDestination = MutableStateFlow("")
        override val currentDestination: StateFlow<String> = _currentDestination

        override fun navigate(action: NavigationAction) = Unit

        override fun navigateBack() = Unit

        override fun <T> setPreviousBackStackEntry(key: String, value: T) = Unit

        override fun <T> getCurrentBackStackEntry(key: String): T? = null

        override fun <T> clearCurrentBackStackEntry(key: String) = Unit
    }

    private class ResourceServiceFake : ResourceService {
        override fun getString(stringRes: StringResource): String {
            return when (stringRes) {
                MR.strings.scr_kitchen_tips_title -> "Kitchen Tips"
                else -> "Test String"
            }
        }

        override fun getString(stringRes: StringResource, args: List<String>): String {
            return "Test String with args"
        }
    }

    private class DeviceServiceFake : DeviceService {
        override fun isAndroid(): Boolean = false

        override fun isIOS(): Boolean = true

        override fun openMailToSupport(mail: String) = Unit

        override fun openUrl(urlString: String) = Unit
    }
}
