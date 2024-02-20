package services;

import java.util.List;

import com.mysql.cj.xdevapi.Client;

import entities.Client;
import repositories.ClientRepository;

public class ClientServices {
        private ClientRepository zoneRepository=new ClientRepository();
    
  public List<Client> listerClients(){
      return clientRepository.selectAll();
   }
   public void ajouterClient(Client client){
    zoneRepository.insert(client);
   }
   
}
