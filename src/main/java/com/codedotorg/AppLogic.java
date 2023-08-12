package com.codedotorg;

public class AppLogic {

    /** The passcode to unlock the app */
    private int passcode;

    /**
     * Constructs an instance of the AppLogic class with the given passcode.
     *
     * @param passcode the passcode to be set for the instance
     */
    public AppLogic(int passcode) {
        this.passcode = passcode;
    }
    
    /**
     * Returns a string indicating whether the given user passcode is correct or incorrect.
     *
     * @param userPasscode the passcode entered by the user
     * @return a string indicating whether the passcode is correct or incorrect
     */
    public String getPasscodeResult(int userPasscode) {
        if (isPasscodeCorrect(userPasscode)) {
            return "Correct passcode";
        }
        else {
            return "Incorrect passcode";
        }
    }

    /**
     * Checks if the given user passcode matches the stored passcode.
     * 
     * @param userPasscode the passcode entered by the user
     * @return true if the user passcode matches the stored passcode, false otherwise
     */
    public boolean isPasscodeCorrect(int userPasscode) {
        if (userPasscode == passcode) {
            return true;
        }
        
        return false;
    }

}
