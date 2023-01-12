package homework10;

import java.util.Arrays;

class StudentRepository extends EntityRepository {
    private static Student[] students = new Student[3];

    public static Student[] getStudents() {
        return students;
    }

    @Override
    protected void getById(int id) {
        for (int j = 0; j < students.length; j++) {
            Student student = students[j];
            if (students[j].getId() == id) {
                System.out.println(student);
            }
        }
    }
}


