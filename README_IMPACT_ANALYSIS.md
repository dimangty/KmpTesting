# Impact Analysis Generator

Инструмент для автоматического создания Impact Analysis из git diff файлов с использованием локальных LLM моделей через Ollama.

## Установка и требования

### 1. Ollama
```bash
# Установите Ollama если еще не установлен
brew install ollama

# Запустите Ollama сервер
ollama serve
```

### 2. Модели

Рекомендуемые модели (выберите одну):

```bash
# Вариант 1: Qwen2.5-coder:32b (рекомендуется)
ollama pull qwen2.5-coder:32b

# Вариант 2: Qwen3-coder:30b
ollama pull qwen3-coder:30b

# Вариант 3: DeepSeek-coder (для русского языка)
ollama pull deepseek-coder:33b
```

**Примечание**: Модели Qwen могут отвечать на английском языке даже при явных инструкциях. Для гарантированного вывода на русском рекомендуется:
- Использовать модели с лучшей поддержкой русского (например, DeepSeek)
- Или редактировать результат вручную

## Использование

### Автоматический режим (рекомендуется)

```bash
# Запустите скрипт с указанием diff файла
./create_impact_analysis.sh your-feature.diff

# Результат будет сохранен в:
# your-feature-impact.md
```

### Ручной режим

```bash
# Объедините промпт и diff
cat Promt_Impact.md your-feature.diff > combined.txt

# Запустите через Ollama
ollama run qwen2.5-coder:32b < combined.txt > output-impact.md
```

### Использование с OpenCode CLI

```bash
/Applications/OpenCode.app/Contents/MacOS/opencode-cli run \
  -m ollama/qwen2.5-coder:32b \
  "Создай Impact Analysis из прикрепленного diff файла следуя инструкциям" \
  -f your-feature.diff -f Promt_Impact.md
```

## Структура файлов

```
.
├── Promt_Impact.md              # Основной промпт с инструкциями
├── Promt_Impact_Strict.md       # Строгая версия промпта
├── Promt_Impact_Final.md        # Финальная версия с примерами
├── create_impact_analysis.sh    # Скрипт для автоматизации
├── test_impact_analysis.sh      # Тестовый скрипт для OpenCode
└── README_IMPACT_ANALYSIS.md    # Эта документация
```

## Формат Impact Analysis

Сгенерированный документ должен содержать 4 раздела:

### 1. Impact analysis
```markdown
# Impact analysis

- Добавлен новый экран "Feature" #F00: описание функционала
- Изменена навигация #0F0: добавлен новый роут
- Обновлен UI #00F: изменены тексты кнопок
```

**Цветовые коды:**
- `#00F` (Low) - текст, стили, мелкие правки
- `#0F0` (Mid) - логика, UI компоненты, изменения без больших переписываний
- `#F00` (High) - новый экран, модуль, большое переписывание

### 2. Сверено с Figma
```markdown
## Сверено с Figma

N/A
```

### 3. Протестировано локально
```markdown
## Протестировано локально

- Проверен сценарий 1
- Проверен сценарий 2
- Проверена работа на Android и iOS
```

### 4. Рекомендации к тестированию
```markdown
## Рекомендации к тестированию

- Проверить на обеих платформах
- Проверить граничные случаи
- Проверить в разных размерах экрана
```

## Настройка модели

Чтобы использовать другую модель, отредактируйте `create_impact_analysis.sh`:

```bash
# Найдите строку:
MODEL="qwen2.5-coder:32b"

# Измените на желаемую модель:
MODEL="deepseek-coder:33b"
# или
MODEL="qwen3-coder:30b"
```

## Примеры использования

### Пример 1: Простой feature
```bash
./create_impact_analysis.sh review_master_app_only.diff
```

### Пример 2: Сложная функциональность
```bash
./create_impact_analysis.sh review_kitchentips_feature.diff
```

### Пример 3: Множественные diff файлы
```bash
for diff in *.diff; do
    ./create_impact_analysis.sh "$diff"
done
```

## Troubleshooting

### Проблема: Модель отвечает на английском

**Решение 1**: Попробуйте модель с лучшей поддержкой русского:
```bash
ollama pull deepseek-coder:33b
# Измените MODEL в скрипте на deepseek-coder:33b
```

**Решение 2**: Отредактируйте результат вручную:
```bash
# Откройте файл
vim your-feature-impact.md

# Переведите на русский язык, сохраняя структуру
```

### Проблема: Ollama не запущен

```bash
# Проверьте статус
ollama list

# Если не работает, запустите сервер
ollama serve
```

### Проблема: Модель не установлена

```bash
# Проверьте список установленных моделей
ollama list

# Установите нужную модель
ollama pull qwen2.5-coder:32b
```

### Проблема: Скрипт не исполняется

```bash
# Сделайте скрипт исполняемым
chmod +x create_impact_analysis.sh

# Запустите снова
./create_impact_analysis.sh your-feature.diff
```

## Дополнительная информация

### Правила нейминга

Выходные файлы создаются автоматически:
- Входной файл: `issue-69.diff`
- Выходной файл: `issue-69-impact.md`

### Интеграция с CI/CD

Скрипт можно интегрировать в CI/CD pipeline:

```yaml
# .github/workflows/impact-analysis.yml
name: Generate Impact Analysis

on:
  pull_request:
    types: [opened, synchronize]

jobs:
  generate-impact:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3

      - name: Setup Ollama
        run: |
          curl -fsSL https://ollama.ai/install.sh | sh
          ollama serve &
          ollama pull qwen2.5-coder:32b

      - name: Generate diff
        run: |
          git diff origin/main...HEAD > pr.diff

      - name: Generate Impact Analysis
        run: |
          ./create_impact_analysis.sh pr.diff

      - name: Upload result
        uses: actions/upload-artifact@v3
        with:
          name: impact-analysis
          path: pr-impact.md
```

## Лицензия

MIT

## Поддержка

Для вопросов и предложений создавайте issues в репозитории проекта.

---

Сгенерировано с помощью Claude Code
