package com.example.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {


    public void btnClickCamiseta() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Executable.class.getResource("AddTshirt.fxml"));
        Parent root = fxmlLoader.load();
        AddTshirtController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }


    public void btnClickCatalogo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Executable.class.getResource("AddCatalog.fxml"));
        Parent root = fxmlLoader.load();
        AddCatalogController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }


    public void btnClickUsuario() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Executable.class.getResource("AddUser.fxml"));
        Parent root = fxmlLoader.load();
        AddUserController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

    public void btnClickList() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Executable.class.getResource("List.fxml"));
        Parent root = fxmlLoader.load();
        ListController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

}
