package homework10;

class Student extends SuperEntity{
    private int courseId;

    public Student(int id) {
        super(id);
    }
    public Student(String name, int id) {
        super(name, id);
    }
    public Student(String name, int id, int courseId) {
        super(name, id);
        this.courseId = courseId;
    }
}



