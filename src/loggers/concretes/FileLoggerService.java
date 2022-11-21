package logger.conscretes;

import logger.abstracts.LoggerService;

public class FileLoggerService implements LoggerService {
    @Override
    public void log() {
        System.out.println("'SUCCESSFULLY Action' logged to RecordFile!");
    }

    @Override
    public void errorLog() {

        System.out.println("'UNSUCCESSFUL Action' logged to RecordFile!");
    }
}
