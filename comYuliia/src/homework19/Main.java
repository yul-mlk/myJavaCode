package homework19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Lecture[] lectures = new Lecture[4];

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Intoduction");
        Lecture lecture2 = new Lecture(2, "Variables");
        Lecture lecture3 = new Lecture(3, "Access modifiers");
        lectures[0] = lecture1;
        lectures[1] = lecture2;
        lectures[2] = lecture3;

        ArrayList<String> HomeWorkList1 = new ArrayList();
        HomeWorkList1.add("1.1. Set up IDEA");
        HomeWorkList1.add("1.2. Create first project");
        HomeWorkList1.add("1.3. Print and display your name");
        System.out.println("Array list of homeworks to lecture 1 " + HomeWorkList1);
        ArrayList<String> HomeWorkList2 = new ArrayList();
        HomeWorkList2.add("2.1. Create and initialize two variables each of primitive numeric integer type");
        HomeWorkList2.add("2.2. Create and initialize two variables each of primitive numeric floating type");
        HomeWorkList2.add("2.3. Create and initialize two variables each of primitive non-numeric character  type");
        HomeWorkList2.add("2.4. Create and initialize two variables each of primitive logical  boolean type");
        HomeWorkList2.add("2.5. Create three variable string reference data types.");
        System.out.println("Array list of homeworks to lecture 2 " + HomeWorkList2);
        ArrayList<String> HomeWorkList3 = new ArrayList();
        HomeWorkList3.add("3.1. Create classes for 4 entities and add fields with the main characteristics of the entities");
        HomeWorkList3.add("3.2. Add to one of the classes such an access modifier, so that the elements of the class are available to any part of the project.");
        HomeWorkList3.add("3.3. Add to one of the classes such an access modifier, so that the elements of the class are only" +
                " accessible within the boundaries of the class.");
        HomeWorkList3.add("3.4. Add to one of the classes an access modifier such that class elements are only accessible within the package.");
        HomeWorkList3.add("3.5. Add to one of the classes such an access modifier, so that the elements of the class are available " +
                "in the boundaries of the package, as well as in the classes that inherit the class.");
        System.out.println("Array list of homework to lecture 3 " + HomeWorkList3);
        ArrayList<String> HomeWorkList4 = new ArrayList();
        HomeWorkList4.add("Repit all materials");
        System.out.println("Additional array list of homeworks  " + HomeWorkList4);
        Map<Integer, ArrayList<String>> mapLectHw = new HashMap<>();
        mapLectHw.put(lecture1.lectureId, HomeWorkList1);
        mapLectHw.put(lecture2.lectureId, HomeWorkList2);
        mapLectHw.put(lecture3.lectureId, HomeWorkList3);
        mapLectHw.put(null, HomeWorkList4);
        System.out.println("All map of homeworks to lectures" + mapLectHw);
        System.out.println("_______________");
        System.out.println("Home work to lecture 1: " + mapLectHw.get(1));
        System.out.println("_______________");
        System.out.println("Home work to lecture 2: " + mapLectHw.get(2));
        System.out.println("_______________");
        System.out.println("Home work to lecture 3: " + mapLectHw.get(3));
        System.out.println("_______________");
        System.out.println("All keys" + mapLectHw.keySet());
        System.out.println("_______________");
        System.out.println("All values" + mapLectHw.values());
        System.out.println("_______________");
        System.out.println("Deleted home work to lecture 1: " + mapLectHw.remove(1));
        System.out.println("_______________");
        System.out.println("All map of homeworks to lectures after deleting homework to lecture1 " + mapLectHw);
        System.out.println("_______________");
        System.out.println("Added again home work to lecture1 instead of deleted: " + mapLectHw.putIfAbsent(1, HomeWorkList1));
        System.out.println("_______________");
        System.out.println("Deleted home work with key null: " + mapLectHw.remove(null));
        System.out.println("All map of homeworks to lectures after deleting homework with key null " + mapLectHw);
        System.out.println("_______________");
        System.out.println("Added new homework with key 4 " + mapLectHw.put(4, HomeWorkList4));
        System.out.println("All map of homeworks to lectures with new added homework with key4 " + mapLectHw);

        System.out.println("___________________________________________");

        AdditionalMaterials additMat1 = new AdditionalMaterials("https://www.jetbrains.com/idea/");
        AdditionalMaterials additMat1a = new AdditionalMaterials("https://www.oracle.com/java/technologies/introduction-to-java.html");
        AdditionalMaterials additMat2 = new AdditionalMaterials("https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html");
        AdditionalMaterials additMat3 = new AdditionalMaterials("https://www.baeldung.com/java-access-modifiers#:~:text=Simply%20put%2C%20there%20are%20four,and%20default%20(no%20keyword).");
        Map<Integer, AdditionalMaterials> mapAdditMat = new HashMap<>();
        mapAdditMat.put(lecture1.lectureId, additMat1);
        mapAdditMat.put(lecture2.lectureId, additMat2);
        mapAdditMat.put(lecture3.lectureId, additMat3);

        System.out.println("All additional materials " + mapAdditMat);
        System.out.println("_______________");
        System.out.println("Additional materials to lecture 1 " + mapAdditMat.get(1));
        System.out.println("_______________");
        System.out.println("Additional materials to lecture 2 " + mapAdditMat.get(2));
        System.out.println("_______________");
        System.out.println("Additional materials to lecture 3 " + mapAdditMat.get(3));
        System.out.println("_______________");
        System.out.println("Deleted  additional materials to lecture 1 " + mapAdditMat.remove(1));
        System.out.println("_______________");
        System.out.println("All additional materials after deleting materials to lecture 1 " + mapAdditMat);
        System.out.println("_______________");
        System.out.println("Added new additional materials to lecture1 instead of deleted materials " + mapAdditMat.putIfAbsent(1, additMat1a));
        System.out.println("All additional materials " + mapAdditMat);

    }
}