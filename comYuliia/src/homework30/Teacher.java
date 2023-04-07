package homework30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teacher {
    String surname;
    String name;
    String email;

    public Teacher(String surname, String name, String email) {
        this.surname = surname;
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Peterson", "Alex", "pet-alex@gmail.com");
        Teacher teacher2 = new Teacher("Mask", "Andrew", "mask-andrew@gmail.com");
        Teacher teacher3 = new Teacher("Carlson", "Emma", "carls-em@gmail.com");
        Teacher teacher4 = new Teacher("Busils", "Andrzej", "bus-andr@gmail.com");
        Teacher teacher5 = new Teacher("Pitt", "Tom", "pitt-tom@gmail.com");
        Teacher teacher6 = new Teacher("Baltkais", "Visvald", "balt-vis@gmail.com");
        Teacher teacher7 = new Teacher("Watson", "Inga", "wats-inga@gmail.com");
        Teacher teacher8 = new Teacher("Nelson", "Alina", "Nels-al@gmail.com");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        teachers.add(teacher6);
        teachers.add(teacher7);
        teachers.add(teacher8);

        //30.3
        Map<String, List<Teacher>> mapTeach = teachers.stream().
                map(t -> {
                    t.setSurname(t.getSurname().toUpperCase());
                    return t;
                }).
                collect(Collectors.groupingBy(t -> t.getEmail()));
        for (Map.Entry<String, List<Teacher>> entry : mapTeach.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}


