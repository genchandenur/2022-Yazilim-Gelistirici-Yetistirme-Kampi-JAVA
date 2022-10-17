package javadersiKodlamaio.business;

import javadersiKodlamaio.core.logging.Logger;
import javadersiKodlamaio.dataAccess.CategoryDao;
import javadersiKodlamaio.entities.Category;

import java.util.ArrayList;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        //this.categories = categories;
    }


    public void add(Category category) throws Exception {
        Category[] categories = {new Category("Programming"), new Category("Data Science")};
        for (Category categoryName : categories) {
            if (category.getCategoryName().equals(categoryName.getCategoryName())) {
                throw new Exception("This category is already available");
            }
        }
            categoryDao.add(category);

            for (Logger logger : loggers) {
                logger.Log(category.getCategoryName());
            }


    }
}