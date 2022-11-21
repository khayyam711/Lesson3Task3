package business.concretes;

import business.abstracts.CategoryService;
import entities.concretes.Category;
import entities.concretes.Entity;
import logger.abstracts.LoggerService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private final BaseManager baseManager;

    public CategoryServiceImpl(BaseManager baseManager) {
        this.baseManager = baseManager;
    }

    @Override
    public Category add(List<Category> categoryList,Category category) {

        if(baseManager.checkName( categoryList,category.name))
        {
            categoryList.add(category);
            baseManager.add(category);
            baseManager.log();
        }
        else{
            System.out.println("Oops!...Choose another name for CATEGORY");
            baseManager.errorLog();
        }

        return category;
    }


}
