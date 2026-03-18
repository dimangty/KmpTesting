#!/bin/bash

# Скрипт для тестирования Impact Analysis с использованием OpenCode + Ollama + Qwen3-coder

set -e

# Цвета для вывода
GREEN='\033[0;32m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Путь к opencode-cli
OPENCODE_CLI="/Applications/OpenCode.app/Contents/MacOS/opencode-cli"

# Проверка наличия diff файла
if [ -z "$1" ]; then
    echo "Использование: $0 <diff_file>"
    echo "Пример: $0 review_master_app_only.diff"
    exit 1
fi

DIFF_FILE="$1"

if [ ! -f "$DIFF_FILE" ]; then
    echo "Ошибка: файл $DIFF_FILE не найден"
    exit 1
fi

# Получаем базовое имя файла для создания output файла
BASENAME=$(basename "$DIFF_FILE" .diff)
OUTPUT_FILE="${BASENAME}-impact.md"

echo -e "${BLUE}Анализируем diff файл: $DIFF_FILE${NC}"
echo -e "${BLUE}Результат будет сохранен в: $OUTPUT_FILE${NC}"
echo ""

# Читаем промт и diff файл
PROMPT=$(cat Promt_Impact.md)
DIFF_CONTENT=$(cat "$DIFF_FILE")

# Формируем полное сообщение
FULL_MESSAGE="$PROMPT

\`\`\`diff
$DIFF_CONTENT
\`\`\`"

# Запускаем opencode с использованием Ollama
# Используем модель qwen3-coder:30b через Ollama
echo -e "${BLUE}Запускаем анализ с помощью Qwen3-coder:30b...${NC}"
echo ""

# Запуск opencode с указанием провайдера Ollama и модели
# Используем формат provider/model для параметра -m
echo "$FULL_MESSAGE" | "$OPENCODE_CLI" run -m ollama/qwen3-coder:30b > "$OUTPUT_FILE"

echo ""
echo -e "${GREEN}Готово! Impact Analysis сохранен в файле: $OUTPUT_FILE${NC}"
echo ""
echo "Содержимое файла:"
echo "===================="
cat "$OUTPUT_FILE"
