Meal Suggestion App

Overview

The Meal Suggestion App is an Android application built using Kotlin. It provides meal suggestions based on the time of day entered by the user. The app features a simple interface where users input a time of day and receive corresponding meal recommendations.

Features
•	User inputs a time of day (e.g., "morning", "mid-morning", "afternoon", "mid-afternoon", "dinner").
•	The app provides a list of meal suggestions based on the input.
•	Users can reset the input and suggestion list.
•	Error handling for invalid inputs.

Technologies Used
•	Kotlin for application logic
•	Android XML for UI design
•	Android SDK for app development

Installation
1.	Clone the repository:
git clone https://github.com/ST10481395/MealSuggestion/
2.	Open the project in Android Studio.
3.	Build and run the application on an emulator or a physical Android device.

Usage
1.	Enter a valid time of day in the text field.
2.	Click "Get suggestion" to see the meal recommendations.
3.	If the input is invalid, an error message will be displayed.
4.	Click "Reset" to clear the input and suggestion list.

Code Structure

MainActivity.kt
Handles user interactions and logic for displaying meal suggestions based on input.
activity_main.xml
Defines the UI layout, including the input field, buttons, and list view for suggestions.

Valid Time of Day Inputs
•	Morning → Suggestions: Eggs, Sausage, Bacon
•	Mid-Morning → Suggestions: Muffin, Pancakes, Waffles
•	Afternoon → Suggestions: Steak sandwich, Pasta, Stir Fry
•	Mid-Afternoon → Suggestions: Mixed nuts, Yogurt, Muesli
•	Dinner → Suggestions: Rice and beans, Sirloin steak, Burger and fries

Contribution

Contributions are welcome! Feel free to submit issues and pull requests.
