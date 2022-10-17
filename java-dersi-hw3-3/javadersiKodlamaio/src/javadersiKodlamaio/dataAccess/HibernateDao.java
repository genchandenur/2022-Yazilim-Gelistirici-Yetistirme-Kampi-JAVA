package javadersiKodlamaio.dataAccess;

import javadersiKodlamaio.entities.Category;
import javadersiKodlamaio.entities.Course;

public class HibernateDao implements CourseDao , CategoryDao{
    public void add(Course course) {

        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
