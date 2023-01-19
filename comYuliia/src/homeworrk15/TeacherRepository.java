package homeworrk15;

public class TeacherRepository {
    static Teacher[] teachers = new Teacher[3];

    public void getById(int id) throws EntityNotFoundException {
        for (int j = 0; j < teachers.length; j++) {
            //Teacher t = getTeachers()[j2];
            if (teachers[j].getTeacherId() == id) {
                System.out.println(teachers[j]);
                return;
            }
            if (j == teachers.length - 1) {
                throw new EntityNotFoundException("This Id is absent");
            }
        }
    }

    public static void main(String[] args) {
        TeacherRepository t1 = new TeacherRepository();
        t1.teachers[0] = new Teacher(1);
        t1.teachers[1] = new Teacher(2);
        t1.teachers[2] = new Teacher(3);
        try {
            t1.getById(4);
        } catch (EntityNotFoundException e) {
            System.out.println("An exception was caught:" + e);
        }
    }
}

