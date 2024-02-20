package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Client;

import entities.Adresse;
import entities.Client;

public class ClientRepository{
   
      public  List<client> selectAll(){
         List<client> clients=new ArrayList<>();
       try {
         
          Class.forName("com.mysql.cj.jdbc.Driver");
         
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iageB" 
                    , "root", "");
       
           Statement statement = conn.createStatement();
           ResultSet rs=   statement.executeQuery("select * from zone");
             while (rs.next()) {
              
                 Client client =new Client();
                 client.setId(rs.getInt("id"));
                 client.setNomcomplet(null);(rs.getString("nomcomplet"));
                 client.setTelephone(rs.getString("telephone"));
                 client.setemail(rs.getString("client"));
                 client.add(client);
             }
             rs.close();
             conn.close();
        } catch (ClassNotFoundException e) {
          System.out.println("Erreur de chargement de Driver");
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  zones;
    }

    public  void insert(Zone zone){
        try {
             //1-Chargement du Driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //2-Se Connecter a une BD
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iagaB" 
                       , "root", "");
               //3-Execution et Recuperation
                Statement statement = conn.createStatement();
               
                int nbreLigne=statement.executeUpdate("INSERT INTO zone (id_zone, nom_zone) VALUES ('"+zone.getNomZone()+"')");
                conn.close();
           } catch (ClassNotFoundException e) {
               System.out.println("Erreur de chargement de Driver");
           }
          catch (SQLException e) {
             System.out.println("Erreur de Connexion a la BD");
         }
        }
          public Client selectcClientbyClient(String nomadresse){
        Client client =null;
        try {
    
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iagaB" 
                   , "root", "");
           Statement statement = conn.createStatement();
           String sql=String.format("Select * from client where tel_client like '%s' ",nomZone);
           ResultSet rs=statement.executeQuery(sql);
            if (rs.next()) {
               
                client=new Adresse();
                client.setId(rs.getInt("id_adresse"));
                Adresse.setNumvillla(rs.getInt("numvilla_client"));
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
           return client;
        }
}
