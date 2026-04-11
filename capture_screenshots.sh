#!/bin/bash

# Screenshot Capture Script for KursovikKMP
# This script helps capture all necessary screenshots for the README

set -e

MISC_DIR="./misc"
PACKAGE="com.example.kursovikkmp.android"
ACTIVITY=".MainActivity"

# Color output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

echo -e "${GREEN}KursovikKMP Screenshot Capture Tool${NC}"
echo "========================================"
echo ""

# Check if adb is available
if ! command -v adb &> /dev/null; then
    echo -e "${RED}Error: adb not found. Please install Android SDK platform tools.${NC}"
    exit 1
fi

# Check if device is connected
if ! adb devices | grep -q "device$"; then
    echo -e "${RED}Error: No Android device connected.${NC}"
    echo "Please connect a device or start an emulator."
    exit 1
fi

echo -e "${GREEN}Device detected!${NC}"
echo ""

# Create misc directory if it doesn't exist
mkdir -p "$MISC_DIR"

# Function to capture screenshot
capture() {
    local filename=$1
    local description=$2
    echo -e "${YELLOW}Capturing: ${description}${NC}"
    echo "Press Enter when ready..."
    read
    adb exec-out screencap -p > "${MISC_DIR}/${filename}"
    echo -e "${GREEN}✓ Saved to ${MISC_DIR}/${filename}${NC}"
    echo ""
}

# Start the app
echo "Starting the app..."
adb shell am start -n "${PACKAGE}/${PACKAGE}${ACTIVITY}"
sleep 2

echo ""
echo -e "${YELLOW}Navigate through the app and capture screenshots as prompted.${NC}"
echo -e "${YELLOW}Make sure to interact with the UI to show the desired screen before pressing Enter.${NC}"
echo ""

# Capture all screenshots
capture "login.png" "Login Screen"
echo "Now navigate to Sign Up screen..."
capture "signup.png" "Sign Up Screen"

echo "For the next screenshots, you'll need to log in first."
echo "After logging in, navigate to each tab using bottom navigation."
echo ""

capture "news.png" "News/Home Screen"
echo "Tap on a news article to view details..."
capture "news_details.png" "News Details Screen"
echo "Go back to News screen..."

echo "Navigate to Favorites tab..."
capture "favorites.png" "Favorites Screen"

echo "Navigate to Recipes tab..."
capture "recipes.png" "Recipes Screen"
echo "Tap on a recipe to view details..."
capture "recipe_details.png" "Recipe Details Screen"
echo "Go back to Recipes screen..."

echo "Navigate to Fridge tab..."
capture "fridge.png" "Fridge Screen (without recommendations)"
echo "Select some products and tap 'Recommend Recipes' button..."
capture "fridge_recommendations.png" "Fridge Screen (with recommendations)"

echo "Tap on Profile icon in the top right corner..."
capture "profile.png" "Profile Screen"

# Optional: PIN screen (need to logout and login to see it)
echo ""
echo -e "${YELLOW}Optional: To capture PIN screen, you need to logout and login again.${NC}"
echo "Do you want to capture PIN screen? (y/n)"
read -r response
if [[ "$response" =~ ^[Yy]$ ]]; then
    echo "Logout and login again. When you see the PIN screen:"
    capture "pin.png" "PIN Screen"
fi

echo ""
echo -e "${GREEN}========================================"
echo "All screenshots captured successfully!"
echo "========================================${NC}"
echo ""
echo "Screenshots saved to: ${MISC_DIR}/"
ls -lh "${MISC_DIR}"/*.png 2>/dev/null || echo "No screenshots found"
echo ""
echo -e "${YELLOW}Tip: You can compress images for better README loading:${NC}"
echo "  find misc/ -name '*.png' -exec pngquant --quality=65-80 --ext .png --force {} \;"
