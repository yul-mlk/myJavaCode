package homework11;

public class Person {
    int courseId;
    static int counter;
    Role role;
    static Role student = Role.STUDENT;

    static Role teacher = Role.TEACHER;
    public Person(Role role) {
        this.role = role;
        counter++;
    }
    public static void createTeacher(Role role) {
        if (role == Role.TEACHER) {
            Teacher teacher = new Teacher();
            System.out.println(teacher);
        } else {
            Student student = new Student();
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        createTeacher(Role.STUDENT);
    }
}

