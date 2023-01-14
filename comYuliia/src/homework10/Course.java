package homework10;

class Course extends SuperEntity {
    static int count;

    public Course(String name, int id) {
        super(name, id);
        count++;
    }
}
