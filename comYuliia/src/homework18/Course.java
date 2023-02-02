package homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    String name;
    int id;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Course course1 = new Course("Java developer");
        Course course2 = new Course("JavaScript developer");
        Course course3 = new Course("Python developer");
        Course course4 = new Course("C++ developer");
        List<String> courseList = new ArrayList<>();
        courseList.add(String.valueOf(course1));
        courseList.add(String.valueOf(course2));
        courseList.add(String.valueOf(course3));
        courseList.add(String.valueOf(course4));
        System.out.println("List of courses: " + courseList);
        Collections.sort(courseList);
        System.out.println("List of courses after sort by name: " + courseList);
    }
}

