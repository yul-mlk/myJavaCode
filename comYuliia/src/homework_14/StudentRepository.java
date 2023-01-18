package homework_14;

public class StudentRepository implements EntityInterface {
    Student[] students = new Student[2];

    public Student[] getStudents() {
        return students;
    }


    @Override
    public void info() {
        for (int i = 0; i < this.getStudents().length; i++) {
            System.out.println(this.students[i]);
        }
    }


    @Override
    public void addLecture() {
        System.out.println("Listen to lecture and study material");
    }

    @Override
    public void size() {
        System.out.println(getStudents().length);
    }

    @Override
    public void getByIndex(int index) {
        for (int i = 0; i < getStudents().length; i++) {
            if (index == i) {
                System.out.println(getStudents()[i]);
            }
        }
    }
}


