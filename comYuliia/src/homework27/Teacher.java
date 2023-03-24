package homework27;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Teacher {
    Integer id;
    String surname;
    String name;


    public Teacher(Integer id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
    }

    public Teacher() {
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Peterson", "Alex");
        Teacher teacher2 = new Teacher(2, "Mask", "Andrew");
        Teacher teacher3 = new Teacher(3, "Carlson", "Emma");
        Teacher teacher4 = new Teacher(4, "Busils", "Andrzej");
        Teacher teacher5 = new Teacher(5, "Pitt", "Tom");
        Teacher teacher6 = new Teacher(6, "Baltkais", "Visvald");
        Teacher teacher7 = new Teacher(7, "Watson", "Inga");
        Teacher teacher8 = new Teacher(8, "Nelson", "Alina");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);
        teachers.add(teacher6);
        teachers.add(teacher7);
        teachers.add(teacher8);
        teachers.forEach(teacher -> System.out.println(teacher));
        //teachers = teachers.stream().filter(el -> el.getId()<5).collect(Collectors.toList());
        System.out.println("____________");
        //teachers.stream().filter(el -> el.getId()<5).forEach(resultTeachers -> System.out.println(resultTeachers));
        System.out.println("____________");
        System.out.println("A list of teachers whose surnames begin with letters that precede the letter N:");
        teachers.stream().sorted((x, y) -> x.getSurname().compareTo(y.getSurname())).filter(teacher -> teacher.getSurname().charAt(0) <= 'N').forEach(resultTeachers -> System.out.println(resultTeachers));
        System.out.println("________***_______");

        // OPTIONAL
        Optional<Teacher> teacherEmpty = Optional.empty();
        System.out.println(teacherEmpty.isPresent());
        System.out.println("__________");

        Teacher teacher = new Teacher();
        Optional<Teacher> teacherOf = Optional.of(teacher);
        System.out.println(teacherOf.isPresent());
        System.out.println("___________");
        teacherOf.ifPresent(teacher0 -> {
            teacher0.setId(15);
            teacher0.setSurname("Sunches");
            teacher0.setName("Carlos");
        });
        System.out.println(teacherOf.get());
        System.out.println("___________");

        Optional<Teacher> teacher10 = Optional.ofNullable(new Teacher(9, "Malyk", "Yuliia"));
        System.out.println(teacher10.isPresent());
        System.out.println(Optional.ofNullable(teacher10));

        System.out.println("____________");
        Teacher teacher9 = new Teacher();
        System.out.println(Optional.ofNullable(teacher9));
        teacher9 = null;
        System.out.println(Optional.ofNullable(teacher9));
    }
}