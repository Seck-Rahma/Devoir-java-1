package Repositories;

import java.util.ArrayList;
import java.util.List;

import Entities Article;
import Entities articleRepository;

public class AdresseRepositories {
  public interface ArticleRepository {
    void addArticle(Article article);
    List<Article> getAllArticles();
}
}
