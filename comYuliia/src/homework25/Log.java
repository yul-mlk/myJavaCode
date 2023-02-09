package homework25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Log {

    LocalDateTime localDateTime = LocalDateTime.now();
    static Date date = new Date();
    LEVEL level;
    String name;
    String message;
    StackTraceElement stacktrace;

    public Log() {
    }

    public Log(Date date, LEVEL level, String name, String message) {
        this.date = date;
        this.level = level;
        this.name = name;
        this.message = message;
    }

    public Log(LocalDateTime localDateTime, LEVEL level, String name, String message) {
        this.localDateTime = localDateTime;
        this.level = level;
        this.name = name;
        this.message = message;
    }

    public Log(LocalDateTime date, LEVEL level, String name, String message, StackTraceElement stacktrace) {
        this.localDateTime = date;
        this.level = level;
        this.name = name;
        this.message = message;
        this.stacktrace = stacktrace;
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

    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSS");
        Log log1 = new Log(LocalDateTime.now(), LEVEL.ERROR, "Lecturelog", "The error needs to be resolved, but the program continues to run");
        Log log2 = new Log(new Date(), LEVEL.WARNING, "Lecturelog", "Unexpected action, but the system fulfilled the request (catch exception)");
        Log log3 = new Log(LocalDateTime.now(), LEVEL.INFO, "Lecturelog", "Action that is important to the program (System.out.print)");
        Log log4 = new Log(LocalDateTime.now(), LEVEL.DEBUG, "Lecturelog", "Expected program action (function result)");
        List<Log> logs;
        logs = new ArrayList<>();
        logs.add(log1);
        logs.add(log2);
        logs.add(log3);
        logs.add(log4);
        System.out.println(log1);

        DateTimeFormatter formForLogTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSS");
        System.out.println("Before format " + LocalDateTime.now());
        System.out.println("Formatted logging record time - " + LocalDateTime.now().format(formForLogTime));

        System.out.println("____________________");
        System.out.println("Testing of parse");
        DateTimeFormatter formForLogTime1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSS");
        LocalDateTime date = LocalDateTime.parse("10-03-2023 23:23:45:787", formForLogTime1);
        System.out.println("After : " + date);

    }
}