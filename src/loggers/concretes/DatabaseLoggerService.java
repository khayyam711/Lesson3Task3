package logger.conscretes;

import logger.abstracts.LoggerService;

public class DatabaseLoggerService implements LoggerService {
    @Override
    public void log() {
        System.out.println("'SUCCESSFULLY Action' logged to Database!");
    }

    @Override
    public void errorLog() {
        System.out.println("'UNSUCCESSFUL Action' logged to Database!");
    }
}
