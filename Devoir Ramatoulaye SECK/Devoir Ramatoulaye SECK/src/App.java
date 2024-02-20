
import java.util.List;
import java.util.Scanner;
import entities.Adresse;
import entities.Client;
import services.ClientServices;

public class App {
       public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
        
        ClientServices ClientServices=new ClientServices();
         AdresseServices=new ClientServices();
        
       
        do {
            System.out.println("1-Créer un client ");
            System.out.println("2-Lister les clients"); 
            System.out.println("3-Ajouter une adresse et lui associe une client"); 
            System.out.println("4-Lister les adresses en affichant le nom duclient ");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrer le nom du client");
                String nomclient=sc.nextLine(); 
                Client client=new Client();
                 Client.setnomcomplet(nomcomplet);
                 ClientService.ajouterclient(client);
                break;
                case 2:
                List<Client> clients=  clientService.listerclient();
                 for (client z: clients) {
                      System.out.println("Numero "+ z.getnomcompletclient());
                      System.out.println("=================================");
                 }
                break;
                case 3:
                System.out.println("Entrer un id");
                String reference=sc.nextLine(); 
                System.out.println("Entrer une ville");
                String description=sc.nextLine();
                System.out.println("Entrer le nom du quartier"); 
                int type=sc.nextInt();
                sc.nextLine();
                 System.out.println("Entrer l'adresse du client");
                 nomcompletclient=sc.nextLine(); 
                   client = clientService.rechercherclientparnom(nomcompletclient);
                    if (client==null) {
                         System.out.println("Entrer un Nom");
                          nomcompletclient=sc.nextLine(); 
                         Client=new client();
                         client.setNomcomplet(nomclient);
                    }
               break;
               case 7:
               List<Adresse> adresses= AdresseServices.listerBien();
                for (Adresse ad: adresses) {
                     System.out.println("id :"+ ad.getId());
                     System.out.println("ville :"+ ad.getVille());
                     System.out.println("quartier :"+ bn.getquartier());
                     System.out.println("numvilla:"+ bn.getnumvilla().getnumvilla());
                     System.out.println("====================================================================");
                }
               break;
                default:
                    break;
            }

        } while (choix!=5);
        
    }
}
