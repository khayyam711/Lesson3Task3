package logger.conscretes;

import logger.abstracts.LoggerService;

public class MailLoggerService implements LoggerService {
    @Override
    public void log() {
        System.out.println("'SUCCESSFULLY Action' logged to Mail!");
    }

    @Override
    public void errorLog() {
        System.out.println("'UNSUCCESSFUL Action' logged to Mail!");
    }
}
