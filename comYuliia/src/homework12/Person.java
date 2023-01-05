package homework12;

public class Person {
    String firstname;
    String lastname;
    String phone;
    String email;

    public Person() {
        System.out.println("You created new person");
    }

    void info() {
        System.out.println("Name is " + firstname + ". Surname is " + lastname + ". Phone number - " + phone + ". E-mail - " + email);
    }

    public Person(String email) {
        this.email = email;
    }

    public Person(String firstname, String lastname, String phone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }
}

