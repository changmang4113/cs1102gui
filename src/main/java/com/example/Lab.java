package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Lab extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Lab");

        // Define the first scene
        Button button1 = new Button("Scene 1");
        StackPane layout1 = new StackPane(button1);
        Scene scene1 = new Scene(layout1, 200, 100);

        // Define the second scene
        Button button2 = new Button("Scene 2");
        StackPane layout2 = new StackPane(button2);
        Scene scene2 = new Scene(layout2, 200, 100);

        // Show scene 1 at first
        primaryStage.setScene(scene1);
        primaryStage.show();

        // When the button is clicked, switch scenes
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        button2.setOnAction(e -> primaryStage.setScene(scene1));        

        primaryStage.show();
    }
}