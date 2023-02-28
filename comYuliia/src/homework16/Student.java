package homework16;

public class Student extends Entity {
    public Student(Integer id) {
        super(id);
    }

    public Student(Integer id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
