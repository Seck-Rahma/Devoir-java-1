package entities;

import java.util.ArrayList;
import java.util.List;

public class Client{
    private int id;
    private String nomcomplet;
    private String  telephone;
    private String email;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomcomplet() {
        return nomcomplet;
    }
    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
