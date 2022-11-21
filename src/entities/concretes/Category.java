package entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class Category extends Entity {

    private List<Course> courseList = new ArrayList<>();

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "courseList=" + courseList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
