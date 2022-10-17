package javadersiKodlamaio.dataAccess;

import javadersiKodlamaio.entities.Category;
import javadersiKodlamaio.entities.Course;
import javadersiKodlamaio.entities.Instructor;

public class HibernateDao implements CourseDao , CategoryDao, InstructorDao{
    public void add(Course course) {

        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
