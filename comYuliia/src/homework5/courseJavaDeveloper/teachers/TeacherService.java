package homework5.courseJavaDeveloper.teachers;

public class TeacherService {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Maxim", 1);
        Teacher teacher2 = new Teacher("Alex", 2);
        Teacher teacher3 = new Teacher("Yuriy", 3);

        System.out.println("Total teachers on the course: " + teacher.teacherCounter);
        System.out.println("Teacher's name is " + teacher2.name + " and teacher's ID is " + teacher2.id);

    }
}

