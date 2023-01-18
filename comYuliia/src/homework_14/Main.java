package homework_14;

public class Main {
    public static void main(String[] args) {

        StudentRepository entityInterface1 = new StudentRepository();
        entityInterface1.getStudents()[0] = new Student(1, "Vasya");
        entityInterface1.getStudents()[1] = new Student(2, "Petya");

        TeacherRepository entityInterface2 = new TeacherRepository();
        entityInterface2.getTeachers()[0] = new Teacher(1, "Alex");
        entityInterface2.getTeachers()[1] = new Teacher(2, "Max");

        LectureRepository entityInterface = new LectureRepository();
        entityInterface.getLectures()[0] = new Lecture(1, "Intoduction");
        entityInterface.getLectures()[1] = new Lecture(2, "Variables");
        entityInterface.getLectures()[2] = new Lecture(3, "Constructor");
        entityInterface.size();
        entityInterface1.size();
        entityInterface2.size();
        System.out.println("_______");
        entityInterface.info();
        System.out.println();
        entityInterface1.info();
        System.out.println();
        entityInterface2.info();
        System.out.println("_______");
        entityInterface.getByIndex(2);
        entityInterface1.getByIndex(0);
        entityInterface2.getByIndex(1);
        System.out.println("_______");
        entityInterface.addLecture();
        entityInterface1.addLecture();
        entityInterface2.addLecture();

    }
}
