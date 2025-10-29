package com.cs2450_assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/com/cs2450_assignment2/Layout3.fxml"));

        Scene scene = new Scene(root, 300, 275);
    
        primaryStage.setTitle("Assignment 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
