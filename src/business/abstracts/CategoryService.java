package business.abstracts;

import entities.concretes.Category;

import java.util.List;

public interface CategoryService  {

    Category add(List<Category> categoryList, Category category);


}
