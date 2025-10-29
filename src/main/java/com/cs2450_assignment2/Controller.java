package com.cs2450_assignment2;


import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
 
public class Controller {
    @FXML private VBox contentArea;

    @FXML
    private void handleHomeButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("Home Content"));
    }

    @FXML
    private void handleAboutButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("About Content"));
    }

    @FXML
    private void handlePublicationsButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("Publications Content"));
    }

    @FXML
    private void handleExhibitionsButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("Exhibitions Content"));
    }


    @FXML
    private void handleNewsButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("News Content"));
    }

    @FXML
    private void handlePublicEventsButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("Public Events Content"));
    }

    @FXML
    private void handleApplyButton(ActionEvent e) {
        contentArea.getChildren().setAll(new Label("Apply Content"));
    }
}
