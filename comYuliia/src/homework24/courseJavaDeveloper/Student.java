package homework24.courseJavaDeveloper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    static final long serialVersionUID = 1;
    String name;
    String surname;
    int id;
    String courseId;

    public Student(String name, String surname, int id, String courseId) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", courseId='" + courseId + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Yuliia", "Malyk", 1, "Java developer");
        Student student1 = new Student("Alina", "Malyk", 2, "Java developer");
        Student student2 = new Student("Alina", "Dudko", 3, "Java developer");
        Student student3 = new Student("Tatiana", "Levchenko", 4, "Java developer");
        Student student4 = new Student("Kateryna", "Boychuk", 5, "Java developer");
        List<Student> studList = new ArrayList<>();
        studList.add(student);
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        System.out.println("List of students: \n" + studList);
        System.out.println("______________________________");
        File file = new File("comYuliia/src/homework24/courseJavaDeveloper/files/students.txt");
        List<Student> deSerialList3;
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            output.writeObject(studList);
            System.out.println("1. Serialization has done");
            deSerialList3 = (ArrayList) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2. Deserialization has done: \n" + deSerialList3);

    }
}

