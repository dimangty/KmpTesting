# KursovikKMP - Kotlin Multiplatform Recipe & News App

A modern Android application built with Kotlin Multiplatform (KMP) that combines news browsing, recipe management, and smart fridge inventory tracking in one comprehensive app.

## Features

### Authentication
- **Login Screen** - Secure email/password authentication
- **Sign Up** - User registration with validation
- **PIN Screen** - Additional PIN-based security layer

### Main Features

#### News (Home)
Browse and read articles with a clean, modern interface
- List view of latest news articles
- Article details with full content
- Add articles to favorites

#### Favorites
Manage your favorite articles and recipes
- View all favorited items
- Quick access to saved content
- Detailed view for each favorite

#### Recipes
Discover and cook with detailed recipe instructions
- Browse recipe catalog
- Detailed recipe view with:
  - Step-by-step cooking instructions
  - Ingredient list with checkboxes
  - Cooking time and difficulty
  - Recipe images
- Mark ingredients as available in your fridge

#### Smart Fridge
Intelligent inventory management with recipe recommendations
- Track products in your fridge (checkbox list)
- Get recipe recommendations based on available ingredients
- See which recipes you can make with current ingredients
- Match percentage for recommended recipes

#### Profile
User profile management
- View and edit profile information (name, gender, birth date, location, email, phone)
- Custom profile photo (camera or gallery)
- Logout functionality

## Architecture

This project follows modern Android development best practices with a clean architecture approach:

### Tech Stack

**Core Technologies:**
- **Kotlin Multiplatform (KMP)** - Share business logic across platforms
- **Jetpack Compose** - Modern declarative UI framework
- **Material 3** - Google's latest material design system
- **Coroutines & Flow** - Asynchronous programming
- **Koin** - Dependency injection

**Architecture Components:**
- **MVVM Pattern** - Model-View-ViewModel architecture
- **LCE State Management** - Loading, Content, Error state handling
- **Navigation Component** - Type-safe navigation
- **SQLDelight** - Type-safe database access
- **Ktor** - Network requests (planned)
- **Coil** - Image loading

### Project Structure

```
TestingKMP/
├── androidApp/                    # Android-specific code
│   ├── core/                      # Shared UI components
│   │   └── src/main/java/
│   │       └── com/example/core/
│   │           ├── BaseScreen.kt
│   │           ├── MyButton.kt
│   │           ├── MyTextField.kt
│   │           ├── MyAlertDialog.kt
│   │           ├── MyErrorDialog.kt
│   │           ├── LoadingDialog.kt
│   │           └── Toolbar.kt
│   ├── feature_auth/              # Authentication UI
│   │   └── src/main/java/
│   │       ├── LoginScreen.kt
│   │       ├── SignUpScreen.kt
│   │       └── PinScreen.kt
│   ├── feature_news/              # News UI
│   │   └── src/main/java/
│   │       ├── NewsScreen.kt
│   │       ├── NewsDetailsScreen.kt
│   │       └── ArticleItemView.kt
│   ├── feature_favorites/         # Favorites UI
│   │   └── src/main/java/
│   │       ├── FavoriteScreen.kt
│   │       ├── FavoriteDetailsScreen.kt
│   │       └── FavoriteItemView.kt
│   └── src/main/java/             # Main app code
│       └── com/example/kursovikkmp/android/
│           ├── MainActivity.kt
│           ├── BottomNavigationBar.kt
│           ├── RecipesScreen.kt
│           ├── FridgeScreen.kt
│           ├── ProfileScreen.kt
│           └── Screens.kt
│
└── shared/                        # Shared KMP code
    ├── core/                      # Core shared logic
    │   └── src/commonMain/kotlin/
    │       ├── base/              # Base classes (ViewModel, Event, State)
    │       ├── common/            # Common utilities (LCE, MVVM)
    │       ├── DB/                # Database (SQLDelight)
    │       ├── network/           # Network layer
    │       ├── navigation/        # Navigation service
    │       └── feature/           # Platform-specific features
    ├── news/                      # News feature module
    ├── favorites/                 # Favorites feature module
    ├── fridge/                    # Fridge feature module
    ├── home/                      # Home feature module
    ├── profile/                   # Profile feature module
    └── recipe/                    # Recipe feature module
```

## Key Design Patterns

### MVVM with LCE States
Each screen follows the MVVM pattern with Loading-Content-Error (LCE) state management:
- **ViewModel** - Holds business logic and state
- **State** - Immutable UI state
- **Events** - User interactions
- **Effects** - One-time events (navigation, dialogs)

### Feature Modularity
The app is organized into feature modules, each containing:
- **UI Layer** (androidApp/feature_*) - Compose screens
- **Domain Layer** (shared/*) - ViewModels, business logic, repositories
- **Data Layer** (shared/core) - Database, network, services

### Navigation
Type-safe navigation using Navigation Compose with sealed class routes:
```kotlin
sealed class Screens(val route: String) {
    object Login : Screens("login_screen")
    object Home : Screens("home_screen")
    object Favorites : Screens("favorites_screen")
    object Recipes : Screens("recipes_screen")
    object Fridge : Screens("fridge_screen")
    object Profile : Screens("profile_screen")
}
```

## Setup Instructions

### Prerequisites
- Android Studio Ladybug or newer
- JDK 17 or newer
- Android SDK API 28+ (minimum) / API 35 (target)

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd TestingKMP
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run on an emulator or physical device (API 28+)

### Build Commands

```bash
# Build the project
./gradlew build

# Run on connected device
./gradlew installDebug

# Run tests
./gradlew test
```

## Screenshots

### Authentication Flow
<p align="center">
  <img src="misc/login.png" width="250" alt="Login Screen"/>
  <img src="misc/signup.png" width="250" alt="Sign Up Screen"/>
  <img src="misc/pin.png" width="250" alt="PIN Screen"/>
</p>

**Login Screen** - Phone number authentication with "Sign Up" link

**Sign Up Screen** - Complete registration form with personal info, location, and contact details

**PIN Screen** - 6-digit PIN entry for additional security

### Main Application
<p align="center">
  <img src="misc/recipes.png" width="250" alt="Recipes List"/>
  <img src="misc/recipe_details.png" width="250" alt="Recipe Details"/>
  <img src="misc/fridge.png" width="250" alt="Fridge Screen"/>
</p>

**Recipes Screen** - Browse recipe catalog with cooking time indicators (Паста Карбонара, Том Ям)

**Recipe Details** - Step-by-step cooking instructions with ingredient checklist and timer

**Fridge Screen** - Smart inventory management with product selection (Авокадо, Бекон, Ваниль, etc.)

---

### Additional Screens

The app also includes:
- **News Screen** - Browse latest articles with list view
- **Favorites Screen** - View saved articles and recipes
- **Profile Screen** - User profile with photo upload and personal information
- **News Details** - Full article view
- **Fridge Recommendations** - Recipe suggestions based on available ingredients

To capture additional screenshots, use the included `capture_screenshots.sh` script or manually capture with:
```bash
adb exec-out screencap -p > misc/<screen_name>.png
```

## Testing

The project includes:
- **Unit Tests** - Business logic testing
- **Instrumented Tests** - UI and integration testing

Run tests with:
```bash
./gradlew test                    # Unit tests
./gradlew connectedAndroidTest   # Instrumented tests
```

## Future Enhancements

- iOS app using shared KMP code
- Real backend API integration
- Recipe search and filtering
- Shopping list generation from recipes
- Nutritional information
- Social sharing features
- Recipe ratings and reviews

## License

[Add your license here]

## Contact

[Add your contact information here]
