package homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i1 = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, select a category: \nfor select course - input 1, \nfor select and create lecture - input 2, " +
                    "\nfor select student - input 3, \nfor select teacher -input 4");
            System.out.println("For EXIT - input 5");
            i1 = scanner.nextInt();
        } while (i1 < 1 || i1 > 5);
        switch (i1) {
            case 1:
                System.out.println("Selected category is course");
                System.out.println();
                break;
            case 2:
                Lecture lecture = new Lecture(9);
                System.out.println("Selected category is lecture and you created new lecture");
                System.out.println("Lecture course ID is " + lecture.courseId);
                System.out.println();
                break;
            case 3:
                System.out.println("Selected category is student");
                System.out.println();
                break;
            case 4:
                System.out.println("Selected category is teacher");
                System.out.println();
                break;
            case 5:
                System.out.println("You exit");
                System.out.println();
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect. Input number from 1 to 4");
        }
        System.out.println("For create 1 more new lecture - input word \"lecture\"");
        System.out.println("For exit - print word \"exit\"");
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();
        switch (s) {
            case "lecture":
                Lecture lecture7 = new Lecture(9);
                System.out.println("You created 1 more new lecture. " + "Total lectures created: " + Lecture.lectureCounter);
                break;
            case "exit":
                System.out.println("exit");
                System.exit(0);
            default:
                System.out.println("Incorrect word.");
                scanner.close();
                scanner1.close();
                //}while (true);
        }
        System.out.println("For create eight lectures input 8");
        System.out.println("For exit - input 9");
        Scanner scanner2 = new Scanner(System.in);
        int i = scanner2.nextInt();
        switch (i) {
            case 8:
                for (i = 1; i <= 8; i++) {
                    String name = "LectureName" + i;
                    Lecture lecture0 = new Lecture(2, name);
                    System.out.println("course" + lecture0.courseId + " " + " " + lecture0.name);
                }
                break;
            case 9:
                System.out.println("exit");
                System.exit(0);
                break;
            default:
                System.out.println("incorrect number");
                break;
        }
    }
}
