# Quick Start - Impact Analysis Generator

## 🚀 Быстрый старт (3 команды)

```bash
# 1. Убедитесь что Ollama запущен
ollama list

# 2. Запустите анализ
./create_impact_analysis.sh review_master_app_only.diff

# 3. Просмотрите результат
cat review_master_app_only-impact.md
```

## 📁 Файлы в проекте

- **Promt_Impact.md** ✅ - Промпт для LLM (главный файл)
- **create_impact_analysis.sh** ✅ - Скрипт автоматизации
- **HOW_TO_USE.md** ✅ - Подробная инструкция
- **README_IMPACT_ANALYSIS.md** ✅ - Техническая документация

## 🎯 Для тестирования используйте:

- `review_master_app_only.diff`
- `review_kitchentips_feature.diff`
- `review_master.diff`

## ⚙️ Настройка модели

Откройте `create_impact_analysis.sh` и измените:
```bash
MODEL="qwen2.5-coder:14b"  # Текущая модель (9GB)
# на
MODEL="qwen2.5-coder:7b"   # Легкая модель (4.7GB)
```

## ⚠️ Известные ограничения

1. Модели Qwen могут отвечать на английском
2. DeepSeek-Coder:33b вызывает ошибки (слишком большая)
3. Ollama выводит ANSI коды в файл

## 💡 Лучший способ

Используйте OpenCode CLI напрямую:

```bash
cat Promt_Impact.md your-feature.diff > temp.txt
/Applications/OpenCode.app/Contents/MacOS/opencode-cli run \
  -m ollama/qwen2.5-coder:14b < temp.txt > output-impact.md
```

## 📖 Больше информации

- `HOW_TO_USE.md` - Подробные инструкции
- `README_IMPACT_ANALYSIS.md` - Техническая документация
- `Promt_Impact.md` - Сам промпт (можно редактировать)

---

**Все готово к использованию!** 🎉
