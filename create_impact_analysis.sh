#!/bin/bash

# Скрипт для создания Impact Analysis из diff файлов
# Использует Ollama + Qwen3-coder:30b напрямую

set -e

# Цвета для вывода
GREEN='\033[0;32m'
BLUE='\033[0;34m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Модель для использования (можно изменить)
# deepseek-coder:33b - может вызывать ошибки ресурсов
# Используем qwen2.5-coder:14b как более стабильную альтернативу
MODEL="qwen2.5-coder:14b"

echo -e "${BLUE}═══════════════════════════════════════════════${NC}"
echo -e "${BLUE}  Impact Analysis Generator${NC}"
echo -e "${BLUE}  Ollama + ${MODEL}${NC}"
echo -e "${BLUE}═══════════════════════════════════════════════${NC}"
echo ""

# Проверка аргументов
if [ -z "$1" ]; then
    echo -e "${YELLOW}Использование:${NC} $0 <diff_file>"
    echo ""
    echo "Пример:"
    echo "  $0 review_master_app_only.diff"
    echo ""
    echo "Доступные diff файлы:"
    ls -1 *.diff 2>/dev/null || echo "  (нет diff файлов в текущей директории)"
    exit 1
fi

DIFF_FILE="$1"

# Проверка существования файла
if [ ! -f "$DIFF_FILE" ]; then
    echo -e "${YELLOW}Ошибка:${NC} файл $DIFF_FILE не найден"
    exit 1
fi

# Получаем базовое имя для output файла
BASENAME=$(basename "$DIFF_FILE" .diff)
OUTPUT_FILE="${BASENAME}-impact.md"

echo -e "${BLUE}📄 Входной файл:${NC} $DIFF_FILE"
echo -e "${BLUE}📝 Выходной файл:${NC} $OUTPUT_FILE"
echo ""

# Проверяем наличие промпта
PROMPT_FILE="Promt_Impact.md"
if [ ! -f "$PROMPT_FILE" ]; then
    echo -e "${YELLOW}Ошибка:${NC} файл $PROMPT_FILE не найден"
    exit 1
fi

# Создаем временный файл с полным промптом
TEMP_FILE=$(mktemp)
trap "rm -f $TEMP_FILE" EXIT

# Объединяем промпт и diff
{
    cat "$PROMPT_FILE"
    echo ""
    echo '```diff'
    cat "$DIFF_FILE"
    echo '```'
} > "$TEMP_FILE"

echo -e "${BLUE}🤖 Запускаем анализ с ${MODEL}...${NC}"
echo -e "${BLUE}⏳ Это может занять некоторое время...${NC}"
echo ""

# Запускаем Ollama с промптом
if ollama run "$MODEL" < "$TEMP_FILE" > "$OUTPUT_FILE" 2>&1; then
    echo ""
    echo -e "${GREEN}✅ Готово! Impact Analysis создан успешно${NC}"
    echo ""
    echo -e "${BLUE}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━${NC}"
    echo -e "${GREEN}Результат сохранен в:${NC} $OUTPUT_FILE"
    echo -e "${BLUE}━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━${NC}"
    echo ""

    # Показываем первые 30 строк результата
    echo "Первые строки результата:"
    echo "---"
    head -30 "$OUTPUT_FILE"
    echo "---"
    echo ""
    echo -e "${BLUE}Полный файл:${NC} cat $OUTPUT_FILE"
else
    echo ""
    echo -e "${YELLOW}⚠️  Ошибка при выполнении анализа${NC}"
    echo "Проверьте, что:"
    echo "  1. Ollama запущен (ollama serve)"
    echo "  2. Модель ${MODEL} установлена (ollama list)"
    exit 1
fi
