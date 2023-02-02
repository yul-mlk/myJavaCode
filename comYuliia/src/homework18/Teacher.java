package homework18;

import java.util.Objects;
import java.util.TreeSet;

public class Teacher implements Comparable<Teacher> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(surname, teacher.surname) && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, id);
    }

    @Override
    public int compareTo(Teacher o) {
        return this.surname.compareTo(o.surname);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Zelenyuk", "Vasyl", 1);
        Teacher teacher1 = new Teacher("Petrenko", "Mykola", 2);
        Teacher teacher2 = new Teacher("Savchuk", "Andriy", 3);
        Teacher teacher3 = new Teacher("Akulenko", "Yan", 4);
        TreeSet<Teacher> teachersTreeSet = new TreeSet<>();
        teachersTreeSet.add(teacher);
        teachersTreeSet.add(teacher1);
        teachersTreeSet.add(teacher2);
        teachersTreeSet.add(teacher3);
        System.out.println("List of teachers after sorting by surname: \n" + teachersTreeSet);
    }
}
