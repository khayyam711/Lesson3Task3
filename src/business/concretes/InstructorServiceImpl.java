package business.concretes;

import business.abstracts.InstructorService;
import entities.concretes.Instructor;
import logger.abstracts.LoggerService;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {

    BaseManager baseManager;

    public InstructorServiceImpl(BaseManager baseManager) {
        this.baseManager = baseManager;
    }


    @Override
    public Instructor add(List<Instructor> instructorList,Instructor instructor) {

        instructorList.add(instructor);
        baseManager.add(instructor);
        baseManager.log();
        return instructor;
    }


}
