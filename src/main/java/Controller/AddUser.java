package Controller;

import Models.User;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class AddUser {
    public static ArrayList<User> users= new ArrayList<>() ;

    public static void newUser(String id, String name, String surname, String secondSurname, String address, String email) {
        User newUser = new User(id, name, surname, secondSurname, address, email);
        users.add(newUser);
    }

    public static void showUsers(ListView list){
        for(int i = 0; i<users.size(); i++){
            list.getItems().add(users.get(i).toString());
        }
    }
}
