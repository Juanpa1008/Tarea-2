package Controller;

import Models.Catalog;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class AddCatalog {
    public static ArrayList<Catalog> catalogs= new ArrayList<>() ;

    public static void newCatalog(String name, String creationDate) {
        Catalog newCatalog = new Catalog(name, creationDate);
        catalogs.add(newCatalog);
    }

    public static void showCatalogs(ListView list){
        for(int i = 0; i<catalogs.size(); i++){
            list.getItems().add(catalogs.get(i).toString());
        }
    }
}
