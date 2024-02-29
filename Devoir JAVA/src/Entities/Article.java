package Entities;



public class Article {
        private String title;
        private String contenu;
        private int id;
        private Date creationDate;
        private boolean state;
        private Category category;
        public Article(String title, String contenu, int id, Date creationDate, boolean state, Category category) {
            this.title = title;
            this.contenu = contenu;
            this.id = id;
            this.creationDate = creationDate;
            this.state = state;
            this.category = category;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getContenu() {
            return contenu;
        }
        public void setContenu(String contenu) {
            this.contenu = contenu;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public Date getCreationDate() {
            return creationDate;
        }
        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }
        public boolean isState() {
            return state;
        }
        public void setState(boolean state) {
            this.state = state;
        }
        public Category getCategory() {
            return category;
        }
        public void setCategory(Category category) {
            this.category = category;
        }
   
}
