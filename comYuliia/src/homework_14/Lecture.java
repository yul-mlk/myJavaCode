package homework_14;

import java.util.Arrays;

public class Lecture {
    int id;
    String name;
    static int count;
    public static Homework[] arrayHomeworks = new Homework[2];

    public Homework[] getArrayHomeworks() {
        return arrayHomeworks;
    }

    public Lecture(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Lecture() {
    }

    public Lecture(int id, String name, Homework[] arrayHomeworks) {
        this.id = id;
        this.name = name;
        this.arrayHomeworks = arrayHomeworks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", arrayHomeworks=" + Arrays.toString(arrayHomeworks) +
                '}';
    }

    public static void main(String[] args) {
        arrayHomeworks[0] = new Homework(1, 1, "1. Set up IDEA");
        arrayHomeworks[1] = new Homework(2, 1, "2. Print and display your name");
        System.out.println(arrayHomeworks.length);
        for (int i = 0; i < arrayHomeworks.length; i++) {
            System.out.println("Index of Homework array is " + i + ", Id is " + arrayHomeworks[i].id + ", lectureId is " + arrayHomeworks[i].lectureId + ", tasks are  " + arrayHomeworks[i].task);
            System.out.println(arrayHomeworks[i]);
        }
        System.out.println("__________");
        Lecture lecture = new Lecture(1, "Introduction", arrayHomeworks);
        System.out.println(lecture);
    }

}

