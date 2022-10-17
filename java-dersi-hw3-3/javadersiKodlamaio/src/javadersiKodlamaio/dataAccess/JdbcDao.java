package javadersiKodlamaio.dataAccess;


import javadersiKodlamaio.entities.Category;
import javadersiKodlamaio.entities.Course;

public class JdbcDao implements CourseDao, CategoryDao {
    public void add(Course course) {

        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}