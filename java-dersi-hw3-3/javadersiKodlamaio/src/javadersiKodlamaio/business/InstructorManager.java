package javadersiKodlamaio.business;

import javadersiKodlamaio.core.logging.Logger;
import javadersiKodlamaio.dataAccess.InstructorDao;
import javadersiKodlamaio.entities.Course;
import javadersiKodlamaio.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        Instructor[] instructors = {new Instructor("Engin Demiroğ"),new Instructor("Vahit Keskin")};
        for (Instructor instructorName : instructors) {
            if (instructor.getInstructorName().equals(instructorName.getInstructorName())) {
                throw new Exception("This instructor is already available");
            }
        }

        instructorDao.add(instructor);

        for (Logger logger : loggers){
            logger.Log(instructor.getInstructorName());
        }

    }
}
