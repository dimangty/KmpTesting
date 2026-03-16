# SwiftUI Screen Template

```swift
import SwiftUI
import shared

enum FeatureViewActions {
    case itemTapped(String)
}

final class FeatureViewModel: BaseViewModel<shared.FeatureViewModel, FeatureState> {
    required override init() {
        super.init()
    }

    func onEvent(event: FeatureViewActions) {
        switch event {
        case .itemTapped(let id):
            mViewModel?.pushEvent(event: .OnItemClicked(id: id))
        }
    }
}

struct FeatureView: View {
    @StateObject private var viewModel = FeatureViewModel()

    var body: some View {
        Text(viewModel.state.titleBarState.title.value)
            .onAppear { viewModel.sendViewAppearedEvent() }
    }
}
```
