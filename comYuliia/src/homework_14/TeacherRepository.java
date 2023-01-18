package homework_14;

public class TeacherRepository implements EntityInterface {

    Teacher[] teachers = new Teacher[2];

    public Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public void info() {
        for (int i = 0; i < getTeachers().length; i++) {
            System.out.println(getTeachers()[i]);

        }
    }

    @Override
    public void addLecture() {
        System.out.println("Create the lecture");
    }

    @Override
    public void size() {
        System.out.println(getTeachers().length);
    }

    @Override
    public void getByIndex(int index) {
        for (int i = 0; i < getTeachers().length; i++) {
            if (index == i) {
                System.out.println(getTeachers()[i]);
            }
        }
    }
}


