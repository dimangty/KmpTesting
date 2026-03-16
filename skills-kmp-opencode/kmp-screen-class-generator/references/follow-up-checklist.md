# Follow-Up Checklist

- Add Android VM registration in `Di.android.kt` with `viewModelOf(::FeatureViewModel)`.
- Add iOS VM registration in `Di.ios.kt` with `factoryOf(::FeatureViewModel)`.
- Add screen route and navigation mapping in Android `NavHost`.
- Add iOS assembly/hosting controller usage if project uses modular assemblies.
- Add real `commonTest` cases for state, events, and navigation.
