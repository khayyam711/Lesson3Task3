package business.concretes;
import business.abstracts.CourseService;
import entities.concretes.Course;
import entities.concretes.Entity;
import logger.abstracts.LoggerService;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    BaseManager baseManager;

    public CourseServiceImpl(BaseManager baseManager) {
        this.baseManager = baseManager;
    }

    @Override
    public Course add(List<Course> courseList,Course course) {

        if(baseManager.checkName(courseList,course.name) || checkGeraterThanByZero(course)){
            courseList.add(course);
            baseManager.add(course);
            baseManager.log();

        }else {
            System.out.println("Oops!...Choose another name for COURSE");
            baseManager.errorLog();
        }


       return course;

    }

    public  Boolean checkGeraterThanByZero(Course course ){
        if (course.getPrice()<0)
            return  false;
        return  true;
    }
}
