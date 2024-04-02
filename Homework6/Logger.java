package Homework6;

interface Logger {
    void logMessage(String message);
}

class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        // логирование в файл
    }
}

class DatabaseLogger implements Logger {
    @Override
    public void logMessage(String message) {
        // логирование в базу данных
    }
}