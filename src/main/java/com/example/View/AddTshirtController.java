package com.example.View;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Controller.AddTshirt;

public class AddTshirtController {

    @FXML
    public TextField txtidTshirt;
    @FXML
    public TextField txtColor;
    @FXML
    public TextField txtSize;
    @FXML
    public TextField txtPicture;
    @FXML
    public TextField txtPrice;
    @FXML
    public TextField txtDescription;
    @FXML
    public Button btnCreatetShirt;

    private AddTshirt tshirtcontroller = new AddTshirt();


    public void btnCreateTshirt() {
        String id = txtidTshirt.getText();
        String color = txtColor.getText();
        String size = txtSize.getText();
        String picture = txtPicture.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        tshirtcontroller.newTshirt(id,color,size,picture,price,description);
    }
}
