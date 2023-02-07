package homework20;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogWriteArray {
    /*public void logCreation() {
        Log log = new Log();
        System.out.println("New log has created" + log);
    }*/
    public static void main(String[] args) {
        Log log1 = new Log(LocalDateTime.now(), LEVEL.ERROR, "Lecturelog1", "The error needs to be resolved, but the program continues to run");
        Log log2 = new Log(LocalDateTime.now(), LEVEL.WARNING, "Lecturelog2", "Unexpected action, but the system fulfilled the request (catch exception)");
        Log log3 = new Log(LocalDateTime.now(), LEVEL.INFO, "Lecturelog3", "Action that is important to the program (System.out.print)");
        Log log4 = new Log(LocalDateTime.now(), LEVEL.DEBUG, "Lecturelog4", "Expected program action (function result)");
        List<Log> logs = new ArrayList<>();
        logs.add(log1);
        logs.add(log2);
        logs.add(log3);
        logs.add(log4);
        // System.out.println(logs);

        File file = new File("comYuliia/src/homework20/files, logsfile.txt");
        try
                (FileWriter fileWriter = new FileWriter(file);) {
            //for (Log log : logs) {
            fileWriter.write(logs.toString());
            // fileWriter.write(log1.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("An exception was caught" + e.getLocalizedMessage());
        }
    }
}


