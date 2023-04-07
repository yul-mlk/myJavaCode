package homework29;

import java.util.ArrayList;
import java.util.List;

public class Person {
    int courseId;
    ROLE role;
    String lastname;
    String firstname;
    String email;

    public Person(int courseId, ROLE role, String lastname, String firstname, String email) {
        this.courseId = courseId;
        this.role = role;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "courseId=" + courseId +
                ", role=" + role +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person(1, ROLE.TEACHER, "Peterson", "Alex", "pet-alex@gmail.com");
        Person person2 = new Person(1, ROLE.STUDENT, "Mask", "Andrew", "mask-andrew@gmail.com");
        Person person3 = new Person(2, ROLE.TEACHER, "Carlson", "Emma", "carls-em@gmail.com");
        Person person4 = new Person(3, ROLE.STUDENT, "Busils", "Andrzej", "bus-andr@gmail.com");
        Person person5 = new Person(4, ROLE.TEACHER, "Pitt", "Tom", "pitt-tom@gmail.com");
        Person person6 = new Person(4, ROLE.STUDENT, "Baltkais", "Visvald", "balt-vis@gmail.com");
        Person person7 = new Person(4, ROLE.STUDENT, "Watson", "Inga", "wats-inga@gmail.com");
        Person person8 = new Person(3, ROLE.STUDENT, "Nelson", "Alina", "Nels-al@gmail.com");
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        Person person9 = new Person(2, ROLE.STUDENT, "Alexienko", "Peet", "pet-alex@gmail.com");
        boolean DublicateEmail = personList.stream().anyMatch(person -> person.getEmail().equals(person9.getEmail()));
        if (DublicateEmail) {
            System.out.println("This email already exists");
        } else {
            personList.add(person9);
        }
    }
}

