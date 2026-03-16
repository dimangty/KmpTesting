# Примеры промтов для skills

## $kmp-feature-development
- `Используй $kmp-feature-development: добавь новый фиче-модуль Orders (State/Events/ViewModel + Android Compose экран + iOS SwiftUI bridge).`
- `Используй $kmp-feature-development: рефактори NewsListViewModel, чтобы поиск и фильтры были вынесены в отдельные функции и покрыты тестами.`

## $swiftui-kmp-baseviewmodel
- `Используй $swiftui-kmp-baseviewmodel: сделай SwiftUI экран ProfileEdit на базе shared ProfileViewModel с action enum и sendViewAppearedEvent.`
- `Используй $swiftui-kmp-baseviewmodel: исправь рассинхрон state между SwiftUI и shared BaseViewModel на экране Favorites.`

## $jetpack-compose-kmp
- `Используй $jetpack-compose-kmp: создай Compose экран RecipesSearch с BaseScreen, collectAsState и событиями в shared Events.`
- `Используй $jetpack-compose-kmp: приведи существующий FridgeScreen к паттерну Screen + ScreenView + Preview.`

## $kmp-unit-tests
- `Используй $kmp-unit-tests: добавь commonTest для LoginViewModel (успех, ошибка, навигация на PIN).`
- `Используй $kmp-unit-tests: перепиши нестабильные тесты NewsListViewModel на Turbine + StandardTestDispatcher.`

## $kmp-koin-di
- `Используй $kmp-koin-di: зарегистрируй новый OrdersRepository и OrdersViewModel для Android и iOS.`
- `Используй $kmp-koin-di: найди и исправь причину No definition found для ProfileViewModel на iOS.`

## $kmp-screen-class-generator
- `Используй $kmp-screen-class-generator: сгенерируй экран Settings для пакета com.example.kursovikkmp.`
- `Используй $kmp-screen-class-generator: сгенерируй экран OrdersHistory без iOS файлов и сразу с --overwrite.`

## Пример прямого запуска генератора
```bash
python3 skills-kmp-opencode/kmp-screen-class-generator/scripts/generate_kmp_screen.py \
  --screen Settings \
  --package com.example.kursovikkmp \
  --output /path/to/your/project
```
