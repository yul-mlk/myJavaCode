package homework9;

import java.util.Arrays;
import java.util.Scanner;

public class LectureService {
    public static void main(String[] args) {

        LectureRepository.lectures[0] = new Lecture("Introduction", 1);

        System.out.println("Length of array " + LectureRepository.lectures.length);
        System.out.println("Amount of created lectures is " + Lecture.count);

        for (int i = 0; i <= 1; i++) {
            if (Lecture.count < LectureRepository.lectures.length) {
                LectureRepository.lectures[1] = new Lecture("Variables", 2);
                LectureRepository.lectures[2] = new Lecture("Methods", 3);
                LectureRepository.lectures[3] = new Lecture("Classes", 4);
                System.out.println("You created 3 lectures. New amount of created lectures is " + Lecture.count);
            } else {
                int lecturesLength = LectureRepository.lectures.length * 3 / 2 + 4;
                Arrays.copyOf(LectureRepository.lectures, lecturesLength);

                System.out.println("The length of the array has increased by the formula (length*3/2+4). New length of array " + lecturesLength);
                System.out.println("Last amount of created lectures is " + Lecture.count);
            }
        }


        int a = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("To display the IDs of all objects in the Lecture's array, press 1.");
            System.out.println("To exit - press 0.");

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    //System.out.println(Arrays.toString(LectureRepository.lectures));
                    for (int j = 0; j < LectureRepository.getLectures().length; j++) {
                        System.out.println("Index of array is " + j + ", name is " + LectureRepository.getLectures()[j].name + ", id is " + LectureRepository.getLectures()[j].id);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number. Try again");
            }
        } while (a != 0);
    }
}

