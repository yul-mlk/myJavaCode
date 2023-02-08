package homework20;

import java.time.LocalDateTime;

public class Log {
    LocalDateTime localDateTime = LocalDateTime.now();
    LEVEL level;
    String name;
    String message;
    StackTraceElement stacktrace;

    public Log() {
    }

    public Log(LocalDateTime date, LEVEL level, String name, String message, StackTraceElement stacktrace) {
        this.localDateTime = date;
        this.level = level;
        this.name = name;
        this.message = message;
        this.stacktrace = stacktrace;
    }

    public Log(LocalDateTime date, LEVEL level, String name, String message) {
        this.localDateTime = date;
        this.level = level;
        this.name = name;
        this.message = message;

    }

    public String getName() {
        return name;
    }


    public LEVEL getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public StackTraceElement getStacktrace() {
        return stacktrace;
    }


    @Override
    public String toString() {
        return "Log{" +
                ", date=" + localDateTime +
                ", level=" + level +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", stacktrace=" + stacktrace +
                '}';
    }

}
