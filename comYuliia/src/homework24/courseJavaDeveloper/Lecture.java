package homework24.courseJavaDeveloper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lecture implements Serializable {
    static final long serialVersionUID = 1;
    int lectureId;
    String name;
    static int count;

    public Lecture() {
    }

    public Lecture(int lectureId, String name) {
        this.lectureId = lectureId;
        this.name = name;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Introduction");
        Lecture lecture2 = new Lecture(2, "Variables");
        Lecture lecture3 = new Lecture(3, "Access modifiers");
        List<Lecture> lectureArrayList = new ArrayList<>();
        lectureArrayList.add(lecture1);
        lectureArrayList.add(lecture2);
        lectureArrayList.add(lecture3);
        System.out.println("List of lectures: " + lectureArrayList);
        System.out.println("________________________________");
        File file = new File("comYuliia/src/homework24/courseJavaDeveloper/files/lectures.txt");
        List<Lecture> deSerialList2;
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            output.writeObject(lectureArrayList);
            System.out.println("Serialization has done");
            deSerialList2 = (ArrayList) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deserialization has done: \n" + deSerialList2);
    }
}

