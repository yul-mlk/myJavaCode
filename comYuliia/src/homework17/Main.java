package homework17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Introduction");
        Lecture lecture2 = new Lecture(2, "Variables");
        Lecture lecture3 = new Lecture(3, "Access modifiers");
        ArrayList<Lecture> lectures = new ArrayList<>();
        lectures.add(lecture1);
        lectures.add(lecture2);
        lectures.add(lecture3);
        System.out.println("ArrayList of lectures" + lectures);

        Student student1 = new Student(1, "Alina");
        Student student2 = new Student(2, "Denis");
        Student student3 = new Student(3, "Max");
        Student student4 = new Student(4, "Alex");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println("ArrayList of students" + students);
        System.out.println(students.get(2));
        System.out.println("__________");
        System.out.println(students.set(0, student4));
        System.out.println(students);
        System.out.println("________");
        System.out.println(students.remove(0));
        System.out.println(students);
        System.out.println("________");
        students.add(0, student1);
        System.out.println(students);
        System.out.println("________");
        Teacher teacher1 = new Teacher(1, "Alex");
        Teacher teacher2 = new Teacher(2, "Andriy");
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        System.out.println("ArrayList of teachers" + teachers);

        ArrayList<ArrayList> entities = new ArrayList<>();
        entities.add(lectures);
        entities.add(students);
        entities.add(teachers);
        System.out.println("________");
        System.out.println("ArrayList of all entities" + entities);

        System.out.println("_____________________");
        AdditionalMaterials.resourseTypeInfo(RESOURCE_TYPE.URL);
        System.out.println("_____________________");
        AdditionalMaterials.resourseTypeInfo(RESOURCE_TYPE.VIDEO);
        System.out.println("_____________________");
        AdditionalMaterials.resourseTypeInfo(RESOURCE_TYPE.BOOK);
    }
}

