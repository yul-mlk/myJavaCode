package homework27;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.logging.Level.INFO;

public class Log {

    LEVEL level;
    String name;
    String message;
    LocalDateTime localDateTime = LocalDateTime.now();
    StackTraceElement stacktrace;

    public Log() {
    }

    public Log(LEVEL level, String name, String message, LocalDateTime localDateTime, StackTraceElement stacktrace) {
        this.level = level;
        this.name = name;
        this.message = message;
        this.localDateTime = localDateTime;
        this.stacktrace = stacktrace;
    }

    public Log(LEVEL level, String name, String message, LocalDateTime localDateTime) {
        this.level = level;
        this.name = name;
        this.message = message;
        this.localDateTime = localDateTime;
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
                "level=" + level +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", localDateTime=" + localDateTime +
                ", stacktrace=" + stacktrace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return level == log.level && Objects.equals(name, log.name) && Objects.equals(message, log.message) && Objects.equals(localDateTime, log.localDateTime) && Objects.equals(stacktrace, log.stacktrace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, name, message, localDateTime, stacktrace);
    }

    public static void main(String[] args) {
        List<Log> logs = Arrays.asList(
                new Log(LEVEL.ERROR, " Lecturelog ", " The error needs to be resolved, but the program continues to run ", LocalDateTime.now()),
                new Log(LEVEL.WARNING, " Lecturelog ", " Unexpected action, but the system fulfilled the request (catch exception) ", LocalDateTime.now()),
                new Log(LEVEL.INFO, " Lecturelog ", " Action that is important to the program (System.out.print) ", LocalDateTime.now()),
                new Log(LEVEL.DEBUG, " Lecturelog ", " Expected program action (function result)", LocalDateTime.now()),
                new Log(LEVEL.INFO, " Mainlog2 ", " Action that is important to the program (System.out.print) ", LocalDateTime.now())
        );
        logs.stream().filter(l -> l.getLevel().equals(LEVEL.INFO)).forEach(logInfo -> System.out.println(logInfo));

        File file = new File("comYuliia/src/homework27/files,logsfile.txt");
        try
                (FileWriter fileWriter = new FileWriter(file);) {
            for (Log log : logs) {
                //fileWriter.write(logs.toString());
                fileWriter.write(String.valueOf(logs.toString()));

            }
            //fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path logPath = Paths.get("comYuliia/src/homework27/files,logsfile.txt");
        try {
            List<String> fromFile = Files.readAllLines(logPath);
            int length = fromFile.size();
            fromFile.stream().skip(length / 2).filter(l -> l.contains("INFO")).forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
