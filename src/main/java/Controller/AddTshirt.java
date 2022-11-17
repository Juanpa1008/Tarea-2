package Controller;

import Models.Tshirt;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class AddTshirt {

    public static ArrayList<Tshirt> tshirts = new ArrayList<>();

    public static void newTshirt(String id, String color, String size, String picture, String price, String description){
        Tshirt newTshirt = new Tshirt(id,color,size,picture,price,description);
        tshirts.add(newTshirt);
    }

    public static void showTshirts(ListView list){
        for (int i = 0; i<tshirts.size(); i++){
            list.getItems().add(tshirts.get(i).toString());
        }
    }
}
