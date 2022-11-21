package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Entity {

    private List<Course> courseList =new ArrayList<>();

    public List<Course> getCourses() {
        return courseList;
    }

    public void setCourses(List<Course> courseList) {
        for (Course course : courseList) {
            if (this.name == course.name) {
                this.courseList.add(course);
            }
        }
    }



    @Override
    public String toString() {
        return "Instructor{" +
                "courseList=" + courseList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
