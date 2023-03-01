package homework16;

import java.util.ArrayList;
import java.util.Collection;

public class Teacher {
    Integer id;
    String name;

    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Teacher[] arrayTeachers = new Teacher[4];

    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Alex");
        Teacher teacher1 = new Teacher(2, "Oleg");
        Teacher teacher2 = new Teacher(3, "Vlad");
        Teacher teacher3 = new Teacher(4, "Max");
        Teacher[] arrayTeachers = new Teacher[4];
        arrayTeachers[0] = teacher;
        arrayTeachers[1] = teacher1;
        arrayTeachers[2] = teacher2;
        arrayTeachers[3] = teacher3;
        /*for (int i = 0; i <arrayTeachers.length; i++) {
            System.out.println(arrayTeachers[i]);}*/
        SimpleIterator<Teacher> iterator = new SimpleIterator<>(arrayTeachers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("_________________");

        iterator.remove(2);
        System.out.println("_______++_______");
        for (int i = 0; i < arrayTeachers.length; i++) {
            System.out.println(arrayTeachers[i]);
        }
    }
}

