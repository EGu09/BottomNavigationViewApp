# Bottom Navigation Drawing App

A simple Android application that demonstrates the implementation of BottomNavigationView with three fragments: Home, Drawing, and Settings. The app allows users to draw on a canvas using finger gestures and clear their drawings with a button.

## Features

- **Bottom Navigation**: Easy navigation between three tabs
- **Home Tab**: Displays a welcome message
- **Drawing Tab**: 
  - Custom drawing canvas that responds to touch input
  - Simple finger painting functionality
  - Clear button to erase all drawings
- **Settings Tab**: Placeholder for future settings implementation

## App Working

The application is built using fragments controlled by a BottomNavigationView. Here's how it works:

1. **MainActivity**: Acts as the container for all fragments and handles navigation between them.
2. **HomeFragment**: A simple fragment displaying a welcome message.
3. **DrawingFragment**: Contains a custom DrawingView for finger painting and a clear button.
4. **SettingsFragment**: A placeholder fragment for future settings implementation.
5. **DrawingView**: A custom view that:
   - Captures touch events (finger movements)
   - Creates paths based on these movements
   - Renders the paths on the canvas
   - Provides functionality to clear all drawings

## Time to Complete

This project took approximately 5 hours to complete:
- 1 hour for project setup and planning
- 2 hours for implementing the navigation and fragments
- 1.5 hours for creating and debugging the DrawingView
- 0.5 hours for testing and refinement

## Most Challenging Parts

The most challenging aspects of building this app were:

1. **Custom View Implementation**: Creating the DrawingView class that properly responds to touch events and renders paths on the canvas required understanding Android's drawing system and event handling.

2. **Path Management**: Managing multiple paths for continuous drawing and ensuring they're properly rendered on the canvas.

3. **Fragment Navigation**: Ensuring proper fragment transactions and state management when navigating between tabs.

## Resources Used

The following resources were used during the development of this app:

- [Android Developer Documentation](https://developer.android.com/docs)
- [Material Design Components](https://material.io/components?platform=android)
- [BottomNavigationView Guide](https://developer.android.com/reference/com/google/android/material/bottomnavigation/BottomNavigationView)
- [Custom View Documentation](https://developer.android.com/develop/ui/views/layout/custom-views/custom-components)
- [Android Path Class Documentation](https://developer.android.com/reference/android/graphics/Path)
- [Stack Overflow](https://stackoverflow.com/) for specific implementation questions
- [Android Studio Documentation](https://developer.android.com/studio/intro) for IDE assistance

## Future Enhancements

Potential future enhancements for this app include:
- Color selection for drawing
- Different brush sizes
- Save/load functionality for drawings
- Undo/redo functionality
- More comprehensive settings options
