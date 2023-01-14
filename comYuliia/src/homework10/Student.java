package homework10;

class Student extends SuperEntity {
    int courseId;
    static int count;

    public Student(int id) {
        super(id);
        count++;
    }

    public Student(String name, int id) {
        super(name, id);
        count++;
    }

    public Student(String name, int id, int courseId) {
        super(name, id);
        this.courseId = courseId;
        count++;
    }
}



