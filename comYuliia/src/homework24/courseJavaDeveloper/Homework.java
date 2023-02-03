package homework24.courseJavaDeveloper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Homework implements Serializable {
    static final long serialVersionUID = 1;
    String task;

    public Homework(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "task='" + task + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<String> homeWorkList1 = new ArrayList();
        homeWorkList1.add("1.1. Set up IDEA");
        homeWorkList1.add("1.2. Create first project");
        homeWorkList1.add("1.3. Print and display your name");
        System.out.println("Array list of homeworks to lecture 1 " + homeWorkList1);
        ArrayList<String> homeWorkList2 = new ArrayList();
        homeWorkList2.add("2.1. Create and initialize two variables each of primitive numeric integer type");
        homeWorkList2.add("2.2. Create and initialize two variables each of primitive numeric floating type");
        homeWorkList2.add("2.3. Create and initialize two variables each of primitive non-numeric character  type");
        homeWorkList2.add("2.4. Create and initialize two variables each of primitive logical  boolean type");
        homeWorkList2.add("2.5. Create three variable string reference data types.");
        System.out.println("Array list of homeworks to lecture 2 " + homeWorkList2);
        ArrayList<String> homeWorkList3 = new ArrayList();
        homeWorkList3.add("3.1. Create classes for 4 entities and add fields with the main characteristics of the entities");
        homeWorkList3.add("3.2. Add to one of the classes such an access modifier, so that the elements of the class are available to any part of the project.");
        homeWorkList3.add("3.3. Add to one of the classes such an access modifier, so that the elements of the class are only" +
                " accessible within the boundaries of the class.");
        homeWorkList3.add("3.4. Add to one of the classes an access modifier such that class elements are only accessible within the package.");
        homeWorkList3.add("3.5. Add to one of the classes such an access modifier, so that the elements of the class are available " +
                "in the boundaries of the package, as well as in the classes that inherit the class.");
        System.out.println("Array list of homeworks to lecture 3 " + homeWorkList3);
        List<ArrayList<String>> homeworks = new ArrayList<>();
        homeworks.add(homeWorkList1);
        homeworks.add(homeWorkList2);
        homeworks.add(homeWorkList3);
        System.out.println("List of all homeworks: " + homeworks);
        System.out.println("__________________________________________-");
        List<ArrayList<String>> deSerialList1;
        File file = new File("comYuliia/src/homework24/courseJavaDeveloper/files/homeworks.txt");
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            output.writeObject(homeworks);
            System.out.println("1. Serialization has done");
            deSerialList1 = (ArrayList) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2. Deserialization has done: \n" + deSerialList1);
    }
}