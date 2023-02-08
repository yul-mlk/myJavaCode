package homework20;

import java.io.*;

public class ReadLog {
    public static void main(String[] args) {

        File file = new File("comYuliia/src/homework20/files, logsfile.txt");
        try {
            FileReader fileReader = new FileReader(file);

            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character + " ");

            }

        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("An exception was caught" + e.getLocalizedMessage());
        }
    }
}
