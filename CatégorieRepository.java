package Repositories;

import java.sql.Statement;
import java.util.List;

import Entities.CategoryRepository;

public interface CategoryRepository {
  void addCategory(Category category);
  List<Category> getAllCategories();
}
 
