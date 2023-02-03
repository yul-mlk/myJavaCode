package homework24.courseJavaDeveloper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Teacher implements Serializable {
    static final long serialVersionUID = 1;
    String surname;
    String name;
    int id;

    public Teacher(String surname, String name, int id) {
        this.surname = surname;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Zelenyuk", "Vasyl", 1);
        Teacher teacher1 = new Teacher("Petrenko", "Mykola", 2);
        Teacher teacher2 = new Teacher("Savchuk", "Andriy", 3);
        Teacher teacher3 = new Teacher("Akulenko", "Yan", 4);
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(teacher);
        teachersList.add(teacher1);
        teachersList.add(teacher2);
        teachersList.add(teacher3);
        System.out.println("List of teachers: "+ teachersList);
        System.out.println("______________________________");
        File file = new File("comYuliia/src/homework24/courseJavaDeveloper/files/teachers.txt");
        List<Teacher> deSerialList4;
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            output.writeObject(teachersList);
            System.out.println("1. Serialization has done");
            deSerialList4 = (ArrayList) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2. Deserialization has done: \n" + deSerialList4);

    }
}
