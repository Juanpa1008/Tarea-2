package com.example.View;

import Controller.AddTshirt;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Controller.AddUser;

public class AddUserController {

    @FXML
    public TextField txtIdUser;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtSurname;
    @FXML
    public TextField txtsecondSurname;
    @FXML
    public TextField txtAddress;
    @FXML
    public TextField txtEmail;
    @FXML
    public Button btnCreateUser;

    private AddUser usercontroller = new AddUser();
    public void BtncreateUser() {
        String id = txtIdUser.getText();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        String secondSurname = txtsecondSurname.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        usercontroller.newUser(id, name, surname, secondSurname, address, email);
    }
}
