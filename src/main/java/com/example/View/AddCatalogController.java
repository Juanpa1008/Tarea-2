package com.example.View;

import Controller.AddTshirt;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Controller.AddCatalog;

public class AddCatalogController {

    @FXML
    public TextField txtName;

    @FXML
    public TextField txtCreationDate;

    @FXML
    public Button btnSaveCatalog;

    private AddCatalog catalogcontroller = new AddCatalog();

    public void btnCreateCatalog() {
        String name = txtName.getText();
        String creationDate = txtCreationDate.getText();
        catalogcontroller.newCatalog(name, creationDate);
    }
}
