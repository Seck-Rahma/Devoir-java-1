package Services;
import java.util.List;

import Entities.Article;
import Repositories.ArticleRepositories;



private ArticleRepository articleRepository;

public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
}

public void addArticle(Article article) {
    articleRepository.addArticle(article);
}

public List<Article> getAllArticles() {
    return articleRepository.getAllArticles();
}
    

