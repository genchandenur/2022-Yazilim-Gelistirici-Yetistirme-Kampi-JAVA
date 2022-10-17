import javadersiKodlamaio.business.CategoryManager;
import javadersiKodlamaio.business.CourseManager;
import javadersiKodlamaio.business.InstructorManager;
import javadersiKodlamaio.core.logging.DatabaseLogger;
import javadersiKodlamaio.core.logging.FileLogger;
import javadersiKodlamaio.core.logging.Logger;
import javadersiKodlamaio.core.logging.MailLogger;
import javadersiKodlamaio.dataAccess.HibernateDao;
import javadersiKodlamaio.dataAccess.JdbcDao;
import javadersiKodlamaio.entities.Category;
import javadersiKodlamaio.entities.Course;
import javadersiKodlamaio.entities.Instructor;

//kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.
//
//        Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.
//
//        Çoklu loglama yapısını simule ediniz.
//
//        Aşağıdaki isterleri gerçekleştiriniz.
//
//        Kurs ismi tekrar edemez
//        Kategori ismi tekrar edemez
//        Bir kursun fiyatı 0 dan küçük olamaz

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course("R",10);

        Category category1 = new Category("Programming");
        //category1.setCategoryName("Programming");
        Category category2 = new Category("Machine Learning");

        Instructor instructor1 = new Instructor("Mustafa Murat Coşkun");



        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        //Logger[] loggers = {}; when we don't want logging

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        categoryManager.add(category2);


        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course1);

        InstructorManager instructorManager = new InstructorManager(new JdbcDao(),loggers);
        instructorManager.add(instructor1);
    }
}