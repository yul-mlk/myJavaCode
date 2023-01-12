package homework10;

import java.util.Arrays;

class TeacherRepository extends EntityRepository {
    protected static Teacher[] teachers = new Teacher[4];

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        for (int k = 0; k < teachers.length; k++) {
            System.out.println("Index of array is " + k + ", name is " + teachers[k].getName() + ", id is " + teachers[k].getId());
        }
    }

    @Override
    protected void addEnt() {
        Teacher teacher = new Teacher();
        System.out.println("Amount of added teachers is " + teacher.count);
    }
}

