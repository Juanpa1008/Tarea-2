package com.example.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Executable extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Executable.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 400);
        stage.setTitle("Directory Clothing!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}