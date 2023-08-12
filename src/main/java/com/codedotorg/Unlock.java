package com.codedotorg;

import java.util.Arrays;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Unlock {

    /** The primary stage of the game */
    private Stage window;

    /** The width of the stage */
    private int width;

    /** The height of the stage */
    private int height;

    /** The label displaying the prompt and results */
    private Label promptLabel;

    /** The text field for the user to enter the passcode */
    private TextField passcodeField;

    /** The logic for creating and checking the passcode */
    private AppLogic logic;

    /**
     * This class represents a GUI window for the app. It contains a prompt label, a text
     * field for entering a passcode, and an instance of AppLogic class for game logic.
     * 
     * @param primaryStage The primary stage of the application.
     * @param width The width of the window.
     * @param height The height of the window.
     */
    public Unlock(Stage primaryStage, int width, int height) {
        this.window = primaryStage;
        window.setTitle("Unlock the App");

        this.width = width;
        this.height = height;

        promptLabel = new Label("Enter passcode");
        passcodeField = new TextField();
        logic = new AppLogic(1234);  
    }
    
    /**
     * This method starts the application by creating a main layout using the createLayout() method, 
     * creating a main scene using the createMainScene() method, and setting the scene and showing it.
     */
    public void startApp() {
        VBox mainLayout = createLayout();

        Scene mainScene = createMainScene(mainLayout);

        setSceneAndShow(mainScene);
    }

    /**
     * Sets the current scene and shows the window.
     * 
     * @param currentScene the scene to be set and shown
     */
    public void setSceneAndShow(Scene currentScene) {
        window.setScene(currentScene);
        window.show();
    }

    /**
     * Creates the main scene for the app.
     * 
     * @param layout the layout of the scene
     * @return the main scene for the app
     */
    public Scene createMainScene(VBox layout) {
        Scene tempScene = new Scene(layout, width, height);
        return tempScene;
    }

    /**
     * Creates a VBox layout and adds the scene components to it.
     * 
     * @return the VBox layout with the scene components added to it.
     */
    public VBox createLayout() {
        VBox tempLayout = new VBox();

        List<Node> sceneComponents = createSceneComponents();

        tempLayout.getChildren().addAll(sceneComponents);

        return tempLayout;
    }

    /**
     * Creates the components for the unlock scene.
     * 
     * @return a list of nodes representing the components of the scene
     */
    public List<Node> createSceneComponents() {
        Button passcodeButton = createPasscodeButton();

        List<Node> componentsList = Arrays.asList(promptLabel, passcodeField, passcodeButton);

        return componentsList;
    }

    /**
     * Creates a button that allows the user to enter a passcode and
     * displays the result of the passcode validation.
     * 
     * @return the created button
     */
    public Button createPasscodeButton() {
        Button tempButton = new Button("Enter");

        tempButton.setOnAction(event -> {
            int enteredPasscode = Integer.parseInt(passcodeField.getText());
            String result = logic.getPasscodeResult(enteredPasscode);
            promptLabel.setText(result);
        });

        return tempButton;
    }

}
