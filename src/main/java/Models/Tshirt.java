package Models;

public class Tshirt {

    private String id;
    private String color;
    private String size;
    private String img;
    private String price;
    private String description;


    public Tshirt(String id, String color, String size, String img, String price, String description) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.img = img;
        this.price = price;
        this.description = description;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id.replace(" ","");
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }


    public String getImg() {
        return img;
    }


    public void setImg(String img) {
        this.img = img;
    }


    public String getPrice() {
        return price;
    }


    public void setPrice(String precio) {
        this.price = precio;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String descripcion) {
        this.description = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tshirt)) return false;
        Tshirt tshirt = (Tshirt) o;
        return getId().equals(tshirt.getId());
    }
}
