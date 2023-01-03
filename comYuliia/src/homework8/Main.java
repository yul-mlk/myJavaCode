package homework8;

import com.sun.jdi.request.MethodEntryRequest;

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
        do {
            switch (i1) {
                case 1:
                    System.out.println("Selected category is course");
                    System.out.println();
                    System.exit(0);
                    return;

                case 2:
                    System.out.println();
                    System.out.println("Selected category is lecture.");
                    System.out.println();
                    System.out.println("For create new lecture - choose and input the number of lectures");
                    int a = scanner.nextInt();
                    for (int j = 1; j <= a; j++) {
                        Lecture lecture = new Lecture(9);
                        System.out.println("You created 1 more new lecture. " + "Total lectures created: " + Lecture.lectureCounter);
                        System.out.println("Lecture course ID is " + lecture.courseId);
                        if (Lecture.lectureCounter == 8) {
                            System.exit(0);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Selected category is student");
                    System.out.println();
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("Selected category is teacher");
                    System.out.println();
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("You exit");
                    System.out.println();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect. Input number from 1 to 4");
                    break;
            }
        } while (true);
    }
}
