# Prompt For OpenCode Desktop Review

Проверено через `/Applications/OpenCode.app/Contents/MacOS/opencode-cli`:
- для одноразового запуска используется `opencode run`
- diff-файл можно прикладывать через `-f/--file`
- для `opencode-cli` лучше явно написать в prompt: `Открой и прочитай файл ...`, потому что одного attachment модели часто недостаточно
- указывай файл как относительный путь `./review_kitchentips_feature.diff`, а не `/review_kitchentips_feature.diff`

Дополнительное усиление по `skills-kmp-opencode.zip`:
- `kmp-feature-development`: проверять целостную цепочку `State/Event/ViewModel -> Android screen -> iOS bridge -> DI -> commonTest`
- `kmp-koin-di`: отдельно проверять `viewModelOf(::FeatureViewModel)` на Android и `factoryOf(::FeatureViewModel)` на iOS, а также включение модулей
- `jetpack-compose-kmp`: на Android искать `koinViewModel()`, `flowState`, `lceState`, `BaseScreen`, передачу `viewModel::pushEvent`, отсутствие прямой навигации из stateless composable
- `swiftui-kmp-baseviewmodel`: на iOS искать Swift-обёртку на `BaseViewModel<shared.FeatureViewModel, FeatureState>`, `sendViewAppearedEvent()` и маппинг Swift actions в shared `pushEvent(...)`
- `kmp-unit-tests`: в `commonTest` искать `runTest`, проверки state/navigation/effect и локальный Koin test setup без production-графа

Для `opencode-desktop`:
1. Для слабой локальной модели сначала используй `review_kitchentips_feature.diff`:
   он содержит только изменения текущей фичи, включая новые untracked-файлы.
2. Если нужен ревью всего продуктового кода ветки, используй `review_master_app_only.diff`.
3. Если нужен сырой diff всей ветки относительно `master`, используй `review_master.diff`.
4. В `opencode-desktop` не проси модель открыть локальный путь через `./...`.
5. В desktop используй `@review_kitchentips_feature.diff` как уже приложенное вложение.
6. Отправь подходящий prompt ниже без изменений.

**Prompt для opencode-desktop**

```text
Делай code review только по вложению `@review_kitchentips_feature.diff`.

Файл уже приложен к сообщению.
Не проси прислать его повторно.
Не пытайся открыть локальный путь вроде `./review_kitchentips_feature.diff` или `/review_kitchentips_feature.diff`.
Используй только содержимое вложения `@review_kitchentips_feature.diff`.

Считай, что это diff относительно `master`, и твоя задача — найти реальные проблемы перед merge.

Работай как reviewer, а не как автор изменений.
Отвечай строго только на русском языке.

Правила:
- Сначала мысленно отфильтруй diff до продуктовых файлов `shared/`, `androidApp/`, `iosApp/`. Удалённые generator/skill/tooling/meta-файлы не анализируй и не описывай.
- Не пересказывай diff и не хвали изменения.
- Ищи только существенные проблемы: баги, регрессии, сломанные пользовательские сценарии, ошибки навигации, проблемы KMP/DI, расхождения между iOS и Android, пропущенные регистрации/зависимости, проблемы сборки, тестов и ресурсов.
- Игнорируй шум, если он не влияет на продукт или сборку: `.idea/`, `xcuserdata/`, архивы, локальные skill-файлы и прочие meta/tooling changes.
- Не предлагай архитектурный рефакторинг и не придирайся к стилю.
- Не придумывай отсутствующие факты.
- Проверь обязательно: navigation/routes, DI/registrations, shared state/viewmodel wiring, iOS parity, Android parity, tests/build coverage.
- Если diff добавляет новый экран, маршрут, event, navigation action, DI registration или тест, проверь целостность всей цепочки.
- Проверь по проектным KMP-паттернам:
  - shared: есть ли `FeatureState`, `FeatureEvents`, `FeatureViewModel`, корректные `updateState { copy(...) }`, навигация только из ViewModel
  - Android Compose: есть ли `koinViewModel()`, сбор `flowState` и `lceState`, обёртка `BaseScreen`, передача событий через `viewModel::pushEvent`, нет ли прямой навигации из composable
  - iOS SwiftUI bridge: есть ли `BaseViewModel<shared.FeatureViewModel, FeatureState>`, `sendViewAppearedEvent()` в `.onAppear`, маппинг Swift actions в shared `pushEvent(...)`
  - DI: Android `viewModelOf(::FeatureViewModel)`, iOS `factoryOf(::FeatureViewModel)`, совпадение конструктора ViewModel и зарегистрированных зависимостей
  - tests: есть ли `runTest` и покрыты ли минимум initial state / event->state / event->navigation для нового сценария
- Нельзя отвечать пустыми секциями.
- Если проблем нет, всё равно перечисли проверенные файлы в секции `Покрытие ревью`.
- Нельзя писать обычный текст на английском языке.
- Запрещено писать, что в diff нет продуктовых файлов, если в diff присутствуют пути под `shared/`, `androidApp/` или `iosApp/`.
- Запрещено просить прислать diff повторно: он уже приложен как `@review_kitchentips_feature.diff`.

Формат ответа:
1. Находки
   - уровень: `высокий` | `средний` | `низкий`
   - файл
   - контекст hunk / строки из diff
   - проблема
   - почему это важно
   - минимальное направление исправления
2. Покрытие ревью
   - перечисли все продуктовые файлы из diff, которые ты реально проверил
   - для каждого дай одну короткую строку, что именно проверял
3. Вопросы / допущения
4. Вердикт
   - `LGTM`
   - или `Нужны правки`

Если проблем нет:
- напиши `Находки: не найдено`
- затем `Покрытие ревью`
- затем `Вердикт: LGTM`
```

**Эквивалент через CLI**

```bash
/Applications/OpenCode.app/Contents/MacOS/opencode-cli run \
  -m ollama/qwen3-coder:30b \
  -f review_kitchentips_feature.diff \
  "<вставь prompt ниже>"
```

## Prompt для CLI

```text
Открой и прочитай файл `review_kitchentips_feature.diff` из текущей директории с помощью доступных read/grep tools.

Используй именно относительный путь `./review_kitchentips_feature.diff`.
Не пытайся открывать `/review_kitchentips_feature.diff` из корня файловой системы.

Делай code review только по содержимому этого файла. Считай, что это diff относительно `master`, и твоя задача — найти реальные проблемы перед merge.

Работай как reviewer, а не как автор изменений.
Отвечай строго только на русском языке.

Правила:
- Сначала отфильтруй diff до продуктовых файлов `shared/`, `androidApp/`, `iosApp/`. Удалённые generator/skill/tooling/meta-файлы игнорируй и не описывай.
- Не пересказывай diff и не хвали изменения.
- Ищи только существенные проблемы: баги, регрессии, сломанные пользовательские сценарии, ошибки навигации, проблемы KMP/DI, расхождения между iOS и Android, пропущенные регистрации/зависимости, проблемы сборки, тестов и ресурсов.
- Игнорируй шум, если он не влияет на продукт или сборку: `.idea/`, `xcuserdata/`, архивы, локальные skill-файлы и прочие meta/tooling changes.
- Не предлагай архитектурный рефакторинг и не придирайся к стилю.
- Используй внешний контекст только если без него нельзя объяснить риск. Если делаешь вывод по косвенным признакам, явно помечай это как `Inference`.
- Не придумывай отсутствующие факты.
- Сначала сделай обязательный проход по этим осям: navigation/routes, DI/registrations, shared state/viewmodel wiring, iOS parity, Android parity, tests/build coverage.
- Если diff добавляет новый экран, маршрут, event, navigation action, DI registration или тест, обязательно проверь целостность всей цепочки, а не отдельный кусок.
- Проверь по проектным KMP-паттернам из `skills-kmp-opencode`:
  - shared: `FeatureState`, `FeatureEvents`, `FeatureViewModel`, `updateState { copy(...) }`, навигация только из ViewModel
  - Android Compose: `koinViewModel()`, `flowState`, `lceState`, `BaseScreen`, `viewModel::pushEvent`, отсутствие прямой навигации из stateless composable
  - iOS SwiftUI bridge: `BaseViewModel<shared.FeatureViewModel, FeatureState>`, `sendViewAppearedEvent()` в `.onAppear`, Swift actions -> shared `pushEvent(...)`
  - DI: Android `viewModelOf(::FeatureViewModel)`, iOS `factoryOf(::FeatureViewModel)`, совпадение зависимостей конструктора с регистрациями
  - tests: `runTest`, initial state, event->state, event->navigation, локальный Koin test setup
- Запрещены общие фразы вида `не хватает контекста`, `нужно проверить UI`, `стоит проверить CI`, если они не привязаны к конкретному изменённому файлу или hunk.
- `No findings` допустимо только если после ревью ты перечислишь конкретные проверенные файлы и кратко объяснишь, почему каждый из них не дал сигналов на проблему.
- Нельзя возвращать пустые секции. Если секция указана, внутри неё должен быть содержательный текст.
- Ответ вида только `Находки / Покрытие ревью / Вердикт` без содержимого является невалидным.
- Перед финальным ответом проверь, что ты заполнил либо минимум одну конкретную находку, либо секцию `Покрытие ревью` минимум из 8 строк с конкретными файлами.
- Любой обычный текст на английском языке недопустим. Английский допускается только внутри путей, имён файлов, идентификаторов кода и literal-значений из diff.
- Если черновик ответа получился не на русском, перепиши его целиком на русский перед отправкой.
- Запрещено писать, что в diff нет продуктовых файлов, если в diff присутствуют пути под `shared/`, `androidApp/` или `iosApp/`.
- Запрещено просить прислать diff повторно: файл уже доступен по пути `./review_kitchentips_feature.diff`.

Формат ответа:
1. Находки
   Для каждой находки укажи:
   - уровень: `высокий` | `средний` | `низкий`
   - файл
   - контекст hunk / строки из diff
   - проблема
   - почему это важно
   - минимальное направление исправления
2. Покрытие ревью
   - перечисли все продуктовые файлы из diff, которые ты реально просмотрел
   - для каждого дай одну короткую строку, что именно проверял
3. Вопросы / допущения
4. Вердикт
   - `LGTM`
   - или `Нужны правки`

Дополнительные требования:
- Сначала перечисли находки, отсортированные по убыванию уровня.
- Если проблем нет, напиши `Находки: не найдено`, но только после секции `Покрытие ревью`.
- Не выдавай абстрактные остаточные риски без ссылки на конкретный diff-hunk или конкретное ограничение входных данных.
- Не пиши пустые заголовки без текста под ними.
- Будь конкретным и коротким.
```
