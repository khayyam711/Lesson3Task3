package business.abstracts;

import entities.concretes.Course;
import entities.concretes.Entity;

import java.util.List;

public interface CourseService  {
    Course add(List<Course> courseList, Course course);

}
