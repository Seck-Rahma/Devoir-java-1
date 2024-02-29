package Services;

import Entities.Client;
import Repositories.categoryRepository;
import java.util.List;

private CategoryRepository categoryRepository;

public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
}

public void addCategory(Category category) {
    categoryRepository.addCategory(category);
}

public List<Category> getAllCategories() {
    return categoryRepository.getAllCategories();
}

