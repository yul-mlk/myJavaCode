package homework9;

import java.util.Arrays;

public class TeacherRepository {
    static Teacher[] teachers = new Teacher[4];

    public static void main(String[] args) {
        teachers[0] = new Teacher(1, "Alex");
        teachers[1] = new Teacher(2, "Max");
        teachers[2] = new Teacher(3, "Pete");
        teachers[3] = new Teacher(4, "Tom");

        System.out.println(Arrays.toString(TeacherRepository.teachers));
        for (int k1 = 0; k1 < teachers.length; k1++) {
            System.out.println("Index of array is " + k1 + ", name is " + teachers[k1].name + ", id is " + teachers[k1].id);
        }
    }
}
