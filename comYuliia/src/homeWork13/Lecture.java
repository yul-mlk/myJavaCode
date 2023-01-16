package homeWork13;

public class Lecture extends Entity {
    static int count = 0;

    public Lecture(int id, String name) {
        super(id, name);
    }

    public Lecture(int id) {
        super(id);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Lecture.count = count;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

