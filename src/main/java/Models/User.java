package Models;

public class User {

    private String id;
    private String name;
    private String surname;
    private String secondSurname;
    private String address;
    private String email;

    /**
     * User Builder
     *@author Juanpa Quesada
     * @param id
     * @param name
     * @param surname
     * @param secondSurname
     * @param address
     * @param email
     */
    public User(String id, String name, String surname, String secondSurname, String address, String email) {
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.address = address;
        this.email = email;
        this.id= id;
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
     * getter for name
     * @author Juanpa Quesada
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @author Juanpa Quesada
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for surname
     * @author Juanpa Quesada
     */
    public String getSurname() {
        return surname;
    }

    /**
     * setter for surname
     * @author Juanpa Quesada
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * getter for Second Surname
     * @author Juanpa Quesada
     */
    public String getSecondSurname() {
        return secondSurname;
    }

    /**
     * setter for Second Surname
     * @author Juanpa Quesada
     */
    public void setSecondSurname(String secondSurname) {
            this.secondSurname = secondSurname;
    }

    /**
     * getter for Address
     * @author Juanpa Quesada
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter Address
     * @author Juanpa Quesada
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * getter for Email
     * @author Juanpa Quesada
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter for Email
     * @author Juanpa Quesada
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Override for Arraylist<users>
     * @author Juanpa Quesada
     */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nombre='" + name + '\'' +
                ", apellido1='" + surname + '\'' +
                ", apellido2='" + secondSurname + '\'' +
                ", direccion='" + address + '\'' +
                ", correo='" + email  + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }
}
