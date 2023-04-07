package homework30;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Student {

    String name;
    String surname;
    int id;
    String courseId;
    String email;

    public Student(String name, String surname, int id, String courseId, String email) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.courseId = courseId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", courseId='" + courseId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Yuliia", "Malyk", 1, "Java developer", "yul-mlk@gmail.com");
        Student student1 = new Student("Alina", "Malyk", 2, "Java developer", "al-mlk@gmail.com");
        Student student2 = new Student("Alina", "Dudko", 3, "Java developer", "dud-al@gmail.com");
        Student student3 = new Student("Tatiana", "Levchenko", 4, "Java developer", "tat-lev@gmail.com");
        Student student4 = new Student("Kateryna", "Boychuk", 5, "Java developer", "kat-boychuk@gmail.com");
        List<Student> studList = new ArrayList<>();
        studList.add(student);
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);

        //30.4

        List<String> resultList = new ArrayList<>();
        resultList = studList.stream()
                .map(st -> st.getEmail())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultList);
        File file = new File("comYuliia/src/homework30/Student.java, studentFile.txt");
        try
                (FileWriter fileWriter = new FileWriter(file);) {
            for (String s : resultList) {
                fileWriter.write(resultList.toString());
            }
            //fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("An exception was caught" + e.getLocalizedMessage());
        }
    }
}