package homework9;

import java.util.Arrays;

public class StudentRepository {
    static Student[] students = new Student[3];

    public static void main(String[] args) {
        students[0] = new Student(1);
        students[1] = new Student(2);
        students[2] = new Student(3);

        System.out.println(Arrays.toString(StudentRepository.students));
        for (int k = 0; k < students.length; k++) {
            System.out.println("Index of array is " + k + ", id is " + students[k].id);
        }
    }
}
