package homeworrk15;

public class Person {
    String firstname;
    String lastname;
    String email;

    public Person() {
    }

    void info() {
        System.out.println("Name is " + firstname + ". Surname is " + lastname + ". E-mail - " + email);
    }
    public Person(String email) {
        this.email = email;
    }

    public Person(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    static Person person = new Person("Yuliia", "Malyk", "mal.yul555@bsmu.edu.ua");
    static Person person1 = new Person("Alina", "Malyk", "mlk.al@gmail.com");

    public void endsWith() throws ValidateException {
        if (email.endsWith("ua")) {
            System.out.println("E-mail ends with ua - " + email);
        } else {
            throw new ValidateException("E-mail doesn't end with .ua");
        }
    }

    public static void main(String[] args) {

        person.info();
        person1.info();
        System.out.println("___________");
        try {
            person.endsWith();
        } catch (ValidateException e) {
            System.out.println("An exception was caught " + e);
        }
        System.out.println("___________");
        try {
            person1.endsWith();
        } catch (ValidateException e) {
            System.out.println("An exception was caught " + e);
        }

    }

}

