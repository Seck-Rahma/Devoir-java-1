import java.util.List;
import java.util.Scanner;

import Entities.Article;
import Entities.Category;
import Entities.Catégorie;


public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);

       
        public class Menu {
            private CategoryService categoryService;
            private ArticleService articleService;
            private Scanner scanner;
        
            public Menu(CategoryService categoryService, ArticleService articleService) {
                this.categoryService = categoryService;
                this.articleService = articleService;
                this.scanner = new Scanner(System.in);
            }

            public void displayMenu() {
                int choice = 0;
                do {
                    System.out.println("1. Creer Categorie");
                    System.out.println("2. Lister  Categorie");
                    System.out.println("3. Ajouter Article");
                    System.out.println("4. Lister  Article");
                    System.out.println("5. Quitter");
                    System.out.print("faites votre choix: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();


             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer un id ");
                     int id =sc.nextLine(); 
                     System.out.println("Entrer un nom");
                     String nom=sc.nextLine();  
                      
                     Category cat=new Category();
                      cat.setId(id);id(id);
                      cat.setnomcat(nomcat);
                      
                    CatégorieService.ajoutercatégorie(cat);
                    break;
                
                case 2:
                    List<categorie> Categorie=  categorieService.listerCategorie();
                     for (Categorie categorie: categorie) {
                          System.out.println("id "+ categorie.getId());
                          System.out.println("nomcat "+ Catégorie.getNomcat());
                         
                          System.out.println("=================================");
                     }
                    break;

                case 3:
                System.out.println("entrer un id ");
                int id=sc.nextLine(); 
                System.out.println("entrer un contenu");
                String contenu =sc.nextLine();
                System.out.println("Entrer un titre"); 
                String titre sc.nextLine();
                System.out.println("Entrer une date de création"); 
                double creationDate sc.nextLine();
                System.out.println("Entrer un état"); 
                String état sc.nextLine();
                sc.nextLine(); 
                      art.setId(id);
                      art.setContent(contenu);
                      art.setTitle(article);
                      art.setCreationDate(creationDate);
                      art.setetat(etat);
                     ArticleService.ajouterService(art);
                    }
                    break;

                    case 4:
                    List<article> articles= articleService.listerarticle();
                    for (articles art: articles) {
                         System.out.println("id :"+ art.getId());
                         System.out.println("contenu :"+ art.getContent());
                         System.out.println("article :"+ art.getAllArticles());
                         System.out.println("creationdate :"+ art.getCreationDate());
                         System.out.println("etat :"+ art.getetat());
                         System.out.println("====================================================================");
                    }
                   break;
                default:
                    break;
            }

        } while (choix!=5);
        
    
    }
}
