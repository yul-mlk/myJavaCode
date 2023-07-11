package homework29;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Log implements java.io.Serializable {
    LEVEL level;
    String name;
    String message;
    LocalDateTime localDateTime = LocalDateTime.now();
    StackTraceElement stacktrace;

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

    public LEVEL getLevel() {
        return level;
    }

    public void setLevel(LEVEL level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public StackTraceElement getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(StackTraceElement stacktrace) {
        this.stacktrace = stacktrace;
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

    public static void main(String[] args) throws IOException {
        List<Log> logs = Arrays.asList(
                new Log(LEVEL.ERROR, " Lecturelog ", " The error needs to be resolved, but the program continues to run ", LocalDateTime.now()),
                new Log(LEVEL.WARNING, " Lecturelog ", " Unexpected action, but the system fulfilled the request (catch exception) ", LocalDateTime.now()),
                new Log(LEVEL.INFO, " Lecturelog ", " Action that is important to the program (System.out.print) ", LocalDateTime.now()),
                new Log(LEVEL.DEBUG, " Lecturelog ", " Expected program action (function result)", LocalDateTime.now()),
                new Log(LEVEL.INFO, " Mainlog2 ", " Action that is important to the program (System.out.print) ", LocalDateTime.now())
        );
        File file = new File("comYuliia/src/homework29/logsfile.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Log log : logs) {
                bufferedWriter.write(log.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Path logPath = Paths.get("comYuliia/src/homework29/logsfile.txt");
        try {
            List<String> logList = Files.readAllLines(logPath);
            int fileSize = logList.size();
            List<String> LogInfo = logList.stream()
                    .skip(fileSize / 2)
                    .filter(log -> log.contains("INFO"))
                    .collect(Collectors.toList());
            System.out.println("Logs with level INFO : " + LogInfo + "\nAmount of logs with level INFO = " + LogInfo.size());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
