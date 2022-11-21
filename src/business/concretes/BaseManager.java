package business.concretes;

import dataAccess.abstracts.Repository;
import entities.concretes.Entity;
import logger.abstracts.LoggerService;

import java.util.List;

public class BaseManager {
    LoggerService[] loggerServices;
    Repository[] repositoryList;

    public BaseManager(LoggerService[] loggerServices, Repository[] repository) {
        this.loggerServices = loggerServices;
        this.repositoryList = repository;
    }
    public void log(){
        for (LoggerService loggerService:loggerServices){
            loggerService.log();
        }
    }
    public void errorLog(){
        for (LoggerService loggerService:loggerServices){
            loggerService.errorLog();
        }
    }

    public void  add(Entity entity){
        for (Repository repository : repositoryList){
            repository.add(entity);
        }
    }
    public Boolean checkName(List<? extends Entity> entityList, String name){


        for(Entity entity:entityList){
            if(entity.name.equals(name))
            {
                return false;
            }
        }

        return true;
    }



}
