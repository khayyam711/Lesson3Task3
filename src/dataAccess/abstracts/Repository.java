package dataAccess.abstracts;

import entities.concretes.Entity;

public interface Repository {
    Entity  add(Entity entity);
    Entity  delete(Entity entity);

}
