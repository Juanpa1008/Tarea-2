package Models;

import java.util.ArrayList;
import java.util.Objects;

public class Catalog {

    private String name;
    private String creationDate;
    private ArrayList<Tshirt> TshirtS = new ArrayList<>();


    public Catalog(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        ArrayList<Tshirt> tshirts = new ArrayList<>();
    }


    public String getName() { return name; }


    public void setName(String name) {
        this.name = name;
    }


    public String getCreationDate() {
        return creationDate;
    }


    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }


    public ArrayList<Tshirt> getTshirtS() {
        return TshirtS;
    }


    public void setTshirtS(ArrayList<Tshirt> camisetas) {
        this.TshirtS = camisetas;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "Name='" + name + '\'' +
                ", Creation Date='" + creationDate + '\'' +
                ", Tshirts=" + TshirtS +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Catalog catalog)) return false;
        return Objects.equals(getName(), catalog.getName()) && Objects.equals(getCreationDate(), catalog.getCreationDate()) && Objects.equals(getTshirtS(), catalog.getTshirtS());
    }
}
