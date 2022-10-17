package javadersiKodlamaio.business;

import javadersiKodlamaio.core.logging.Logger;
import javadersiKodlamaio.dataAccess.CourseDao;
import javadersiKodlamaio.dataAccess.HibernateDao;
import javadersiKodlamaio.dataAccess.JdbcDao;
import javadersiKodlamaio.entities.Category;
import javadersiKodlamaio.entities.Course;


public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = {new Course("Java",26), new Course("Python",30)};
		for (Course courseName : courses) {
			if (course.getCourseName().equals(courseName.getCourseName())) {
				throw new Exception("This course is already available");
			}
		}
		if (course.getCoursePrice() < 0){
			throw new Exception("The course fee cannot be less than 0");
		}

		courseDao.add(course);

		for (Logger logger : loggers){
			logger.Log(course.getCourseName());
		}
		
	}

}
