package Models;

public class Tshirt {

    private String id;
    private String color;
    private String size;
    private String img;
    private String price;
    private String description;

    /**
     * Tshirt Builder
     * @author Juanpa Quesada
     * @param id
     * @param color
     * @param size
     * @param img
     * @param price
     * @param description
     */
    public Tshirt(String id, String color, String size, String img, String price, String description) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.img = img;
        this.price = price;
        this.description = description;
    }

    /**
     * getter for id
     * @author Juanpa Quesada
     */
    public String getId() {
        return id;
    }

    /**
     * setter for id
     * @author Juanpa Quesada
     */
    public void setId(String id) {
        this.id = id.replace(" ","");
    }

    /**
     * getter for color
     * @author Juanpa Quesada
     */
    public String getColor() {
        return color;
    }

    /**
     * setter for color
     * @author Juanpa Quesada
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter for size
     * @author Juanpa Quesada
     */
    public String getSize() {
        return size;
    }

    /**
     * setter for size
     * @author Juanpa Quesada
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * getter for img
     * @author Juanpa Quesada
     */
    public String getImg() {
        return img;
    }

    /**
     * setter for img
     * @author Juanpa Quesada
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * getter for price
     * @author Juanpa Quesada
     */
    public String getPrice() {
        return price;
    }

    /**
     * setter for price
     * @author Juanpa Quesada
     */
    public void setPrice(String precio) {
        this.price = precio;
    }

    /**
     * getter for description
     * @author Juanpa Quesada
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for description
     * @author Juanpa Quesada
     */
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
