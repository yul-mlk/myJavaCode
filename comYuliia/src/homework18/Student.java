package homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {

        int result = this.surname.compareTo(o.surname);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    public static void main(String[] args) {
        Student student = new Student("Yuliia", "Malyk", 1, "Java developer");
        Student student1 = new Student("Alina", "Malyk", 4, "JavaScript developer");
        Student student2 = new Student("Alina", "Dudko", 4, "Java developer");
        Student student3 = new Student("Tatiana", "Levchenko", 2, "Python developer");
        Student student4 = new Student("Kateryna", "Boychuk", 3, "C++ developer");
        List<Student> studList = new ArrayList<>();
        studList.add(student);
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        System.out.println("List of students before sorting: \n" + studList);
        Collections.sort(studList);
        System.out.println();
        System.out.println("List of students after sorting by surname (same surnames are also sorted by name): \n" + studList);

    }
}

