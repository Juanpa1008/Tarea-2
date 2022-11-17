package Models;

public class User {

    private String id;
    private String name;
    private String surname;
    private String secondSurname;
    private String address;
    private String email;


    public User(String id, String name, String surname, String secondSurname, String address, String email) {
        this.name = name;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.address = address;
        this.email = email;
        this.id= id;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id.replace(" ","");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSecondSurname() {
        return secondSurname;
    }


    public void setSecondSurname(String secondSurname) {
            this.secondSurname = secondSurname;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


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
