package homeworrk15;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static Lecture[] lectures = new Lecture[4];
    static Student[] students = new Student[3];
    static int a = 0;

    public static void getLectId(int a) {
        for (int j = 0; j < lectures.length; j++) {
            Lecture l = lectures[j];
            if (lectures[j].id == a) {
                System.out.println(l);
            }
        }
    }
    public static void getStudId(int a) {
        for (int j = 0; j < students.length; j++) {
            Student s = students[j];
            if (students[j].id == a) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Length of lectures array " + lectures.length);
        System.out.println("Length of students array " + students.length);
        lectures[0] = new Lecture("Introduction", 1);
        lectures[1] = new Lecture("Variables", 2);
        lectures[2] = new Lecture("Methods", 3);
        lectures[3] = new Lecture("Classes", 4);

        students[0] = new Student("Alex", 2);
        students[1] = new Student("Max", 3);
        students[2] = new Student("Jane", 4);
        System.out.println("Amount of created lectures is " + Lecture.count);
        System.out.println("Amount of created students is " + Student.count);


        do {
            System.out.println("To display entity by id1 - press 1.");
            System.out.println("To display entity by id2 - press 2.");
            System.out.println("To display entity by id3 - press 3.");
            System.out.println("To display entity by id4 - press 4.");
            System.out.println("To exit - press 0.");
            try {

                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();

                switch (a) {
                    case 1:
                        getLectId(a);
                        getStudId(a);
                        break;
                    case 2:
                        getLectId(a);
                        getStudId(a);
                        break;
                    case 3:
                        getLectId(a);
                        getStudId(a);
                        break;
                    case 4:
                        getLectId(a);
                        getStudId(a);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Incorrect number. Try again");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("An exception was caught - " + e + " - Letters or fractional numbers have been entered. Only whole numbers are allowed.");
            }
        } while (a != 0);
    }
}



