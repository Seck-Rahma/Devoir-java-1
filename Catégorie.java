package Entities;



    public class Catégorie {
        private int id;
        private String nomcat;
        public Catégorie(int id, String nomcat) {
            this.id = id;
            this.nomcat = nomcat;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNomcat() {
            return nomcat;
        }
        public void setNomcat(String nomcat) {
            this.nomcat = nomcat;
        }
      
    }
