package com.example.View;

import Models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import Controller.AddUser ;
import Controller.AddCatalog;
import Controller.AddTshirt;

import java.util.ArrayList;
import java.util.List;

public class ListController {

    @FXML
    public Button btnList;

    @FXML
    public ListView UserList;

    @FXML
    public ListView CatalogList;

    @FXML
    public ListView TshirtList;


    public void btnlist(){
       AddCatalog.showCatalogs(CatalogList);
       AddUser.showUsers(UserList);
       AddTshirt.showTshirts(TshirtList);
    }


}
