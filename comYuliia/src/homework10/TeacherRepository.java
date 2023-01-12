package homework10;

import java.util.Arrays;

class TeacherRepository extends EntityRepository{
    private static Teacher[] teachers = new Teacher[4];

    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static void main(String[] args) {
        teachers[0] = new Teacher("Alex",1 );
        teachers[1] = new Teacher("Max", 2);
        teachers[2] = new Teacher("Pete", 3);
        teachers[3] = new Teacher("Tom", 4);

        System.out.println(Arrays.toString(TeacherRepository.teachers));
        for (int k1 = 0; k1 < teachers.length; k1++) {
            System.out.println("Index of array is " + k1 + ", name is " + teachers[k1].getName() + ", id is " + teachers[k1].getName() + ", experience - " + teachers[k1].getExperience());
        }
    }
}
