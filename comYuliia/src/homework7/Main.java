package homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i1 = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, select a category: \nfor select course - input 1, \nfor select and create lecture - input 2, " +
                    "\nfor select student - input 3, \nfor select teacher -input 4");
            i1 = scanner.nextInt();
        } while (i1 < 1 || i1 > 4);
        switch (i1) {
            case 1:
                System.out.println("Selected category is course");
                System.out.println();
                break;
            case 2:
                Lecture lecture = new Lecture(8);
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
            default:
                System.out.println("incorrect. Input number from 1 to 4");
        }
        System.out.println("For create 1 more new lecture - input word \"lecture\"");
        Scanner scanner1 = new Scanner(System.in);
        String s = scanner1.nextLine();
        switch (s) {
            case "lecture":
                Lecture lecture7 = new Lecture(2);
                System.out.println("You created 1 more new lecture. " + "Total lectures created: " + Lecture.lectureCounter);
                break;
            default:
                System.out.println("Incorrect word.");
                break;
        }
    }
}