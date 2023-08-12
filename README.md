# Unlock the App

## Introduction

This is a simple app built with JavaFX. The app presents a GUI window asking the user to guess (or know) a specific passcode to unlock the app. Once the user inputs a passcode, the app informs the user if the entered passcode is correct or not.

## Components

**Unlock.java:**

* Represents the main GUI interface of the app
* Contains GUI components like a label for prompts, a text field for passcode input, and a button to submit the guess
* Interacts with the `AppLogic` class to validate the entered passcode

**AppLogic.java:**

* Represents the backend logic for the app
* Stores the correct passcode and provides methods to check the correctness of a user-provided passcode

## Getting Started

1. **Prerequisities:**

   * Java Development Kit (JDK) with JavaFX
   * A suitable IDE for Java, like VS Code, Eclipse, or IntelliJ IDEA

2. **Setup:**

   * Clone the repo and open in your IDE

3. **Running the App:**

   * Run `App.java` to start the application.
   * Enter the passcode into the displayed window and press "Enter" to see if you guessed correctly. (Default passcode: `1234`)

## Possible Enhancements

* Implement multiple user accounts with different passcodes
* Add additional security measures like a limited number of gusses
