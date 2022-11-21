package dataAccess.concretes;

import dataAccess.abstracts.Repository;
import entities.concretes.Entity;

public class HibernateDatabaseDao implements Repository {
    @Override
    public Entity add(Entity entity) {
        System.out.println(entity.name+" Data inserted to database by Hibernate!");
        return entity;
    }

    @Override
    public Entity delete(Entity entity) {
        System.out.println(entity.name+" Data deleted to database by Hibernate!");
        return entity;
    }
}
