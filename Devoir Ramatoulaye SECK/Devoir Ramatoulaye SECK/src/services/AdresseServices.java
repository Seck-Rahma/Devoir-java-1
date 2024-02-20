package services;

import java.util.List;

import entities.Adresse;
import repositories.AdresseRepository;

  public class AdresseServices {
        AdresseRepository adresseRepository=new AdresseRepository();
        public void ajouterAdresse(Adresse adresse){
        adresseRepository.insert(adresse);
        }
    
        public list<Adresse> listerAdresse(){
            return adresseRepository.selectAll();
        }


  }
