package entities;

import java.sql.Date;

public class Adresse {
    private int id;
    private String ville;
    private String quartier;
    private int numvillla;
    ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public int getNumvillla() {
        return numvillla;
    }
    public void setNumvillla(int numvillla) {
        this.numvillla = numvillla;
    }
    

 
}
