package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Adresse;
import entities.client;


public class AdresseRepository {
    public void insert(Adresse adresse){
        
    }
     public List<Adresse> selectAll(){
         List<Adresse> adresses=new ArrayList<>();
          try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iageB" 
                   , "root", "");
             Statement statement = conn.createStatement();
             String sql="SELECT * FROM `adresse` b, client cl  WHERE b.client_id=cl.id_adresse;";
             ResultSet rs=statement.executeQuery(sql);
            while (rs.next()) {
               
                Adresse client=new Adresse();
                client.setId(rs.getInt("id_adresse"));
                client.setNumvillla(0);(rs.getString("Numvillla"));

            }
            statement.close();
            rs.close();
            conn.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Erreur de chargement de Driver");
       }
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
       return  adresses;
      }
}
