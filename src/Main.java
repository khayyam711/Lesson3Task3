import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.InstructorService;
import business.concretes.BaseManager;
import business.concretes.CategoryServiceImpl;
import business.concretes.CourseServiceImpl;
import business.concretes.InstructorServiceImpl;
import dataAccess.abstracts.Repository;
import dataAccess.concretes.HibernateDatabaseDao;
import dataAccess.concretes.JdbcDatabaseDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Instructor;
import logger.abstracts.LoggerService;
import logger.conscretes.DatabaseLoggerService;
import logger.conscretes.FileLoggerService;
import logger.conscretes.MailLoggerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Course> courseList=new ArrayList<>();
        List<Category> categoryList = new ArrayList<>();
        List<Instructor> instructorList = new ArrayList<>();

        LoggerService[] iLoggerServices=new LoggerService[]{new DatabaseLoggerService(), new FileLoggerService(),new MailLoggerService()};
        Repository[] repositoryList =new Repository[]{new JdbcDatabaseDao(),new HibernateDatabaseDao()};

        BaseManager baseManager=new BaseManager(iLoggerServices, repositoryList);

        CourseService courseService=new CourseServiceImpl(baseManager);
        InstructorService instructorService = new InstructorServiceImpl(baseManager);
        CategoryService categoryService = new CategoryServiceImpl(baseManager);



        //Category objects    --------------------------------------------------------------------
        Category category1 = new Category();
        category1.id=1;
        category1.name="Web";


        Category category2 = new Category();
        category2.id=2;
        category2.name="WindowsForm";


        Category category3 = new Category();
        category3.id=2;
        category3.name="Android";



        Category category4 = new Category();
        category4.id=2;
        category4.name="Web";                   //category4.name already used



        categoryService.add(categoryList,category1);
        categoryService.add(categoryList,category2);
        categoryService.add(categoryList,category3);
        categoryService.add(categoryList,category4);



        //Instructor objects --------------------------------------------------------------------
        Instructor instructor1 = new Instructor();
        instructor1.id=7;
        instructor1.name="Khayyam";

        Instructor instructor2 = new Instructor();
        instructor2.id=5;
        instructor2.name="Ravil";

        instructorService.add(instructorList,instructor1);
        instructorService.add(instructorList,instructor2);
        instructor1.setCourses(courseList);
        instructor2.setCourses(courseList);


        //Course objects    --------------------------------------------------------------------
        Course course1=new Course();
        course1.id=9;
        course1.name="Kurs1";
        course1.setPrice(3.1);
        course1.setInstructor(instructor1);
        course1.setCategory(category1);

        Course course2=new Course();
        course2.id=4;
        course2.name="Kurs2";
        course2.setPrice(5.3);
        course2.setInstructor(instructor2);
        course2.setCategory(category2);

        Course course3=new Course();
        course3.id=8;
        course3.name="Kurs1";                  //course3.name already used
        course3.setPrice(5.3);
        course3.setInstructor(instructor1);
        course3.setCategory(category3);

        Course course4=new Course();
        course4.id=12;
        course4.name="Kurs4";                  //course4.price <0
        course4.setPrice(-5.3);
        course4.setInstructor(instructor2);
        course4.setCategory(category3);

        courseService.add(courseList,course1);
        courseService.add(courseList,course2);
        courseService.add(courseList,course3);
        courseService.add(courseList,course4);



        System.out.println("------------------------------FULL SHOW LISTS------------------------------");
        categoryList.forEach(System.out::println);
        courseList.forEach(System.out::println);
        instructorList.forEach(System.out::println);
    }
}