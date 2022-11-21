package business.abstracts;

import entities.concretes.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor add(List<Instructor> instructorList, Instructor instructor);

}
