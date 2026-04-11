# Screenshots Directory

This directory contains screenshots for the main README.md file.

## Required Screenshots

To complete the documentation, capture the following screenshots:

### Authentication Screens
1. **login.png** - Login screen with email/password fields
2. **signup.png** - Sign up screen with registration form
3. **pin.png** - PIN entry screen (4-digit PIN)

### Main Application Screens
4. **news.png** - News/Home screen showing article list
5. **favorites.png** - Favorites screen showing saved items
6. **recipes.png** - Recipes screen showing recipe cards
7. **fridge.png** - Fridge screen with product checklist

### Detail Screens
8. **news_details.png** - News article detail view
9. **recipe_details.png** - Recipe detail with ingredients and steps
10. **profile.png** - User profile screen

### Special Features
11. **fridge_recommendations.png** - Fridge screen showing recipe recommendations based on selected products

## How to Capture

### Option 1: Automated Script
Run the provided capture script:
```bash
./capture_screenshots.sh
```

### Option 2: Manual Capture
1. Connect your Android device or start an emulator
2. Launch the app
3. Navigate to each screen
4. Capture screenshots using:
```bash
adb exec-out screencap -p > misc/<filename>.png
```

### Option 3: Using Android Studio
1. Run the app on an emulator
2. Use the camera button in the emulator toolbar
3. Save screenshots to this directory

## Screenshot Guidelines

- **Resolution**: Use device default (preferably 1080x2400 or similar)
- **Format**: PNG for best quality
- **Orientation**: Portrait mode
- **Content**:
  - Use realistic data (not just "Test 1", "Test 2")
  - Show the app in a populated state
  - Ensure good lighting/contrast for readability
  - Capture the full screen including status bar

## Image Optimization

After capturing, you can optimize images for web:
```bash
# Using pngquant (install with: brew install pngquant)
find misc/ -name '*.png' -exec pngquant --quality=65-80 --ext .png --force {} \;

# Using ImageMagick (install with: brew install imagemagick)
find misc/ -name '*.png' -exec convert {} -resize 50% {} \;
```

## Current Status

- [ ] login.png
- [ ] signup.png
- [ ] pin.png
- [ ] news.png
- [ ] favorites.png
- [ ] recipes.png
- [ ] fridge.png
- [ ] news_details.png
- [ ] recipe_details.png
- [ ] profile.png
- [ ] fridge_recommendations.png

Check off items as screenshots are captured.
