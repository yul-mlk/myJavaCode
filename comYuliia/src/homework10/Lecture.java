package homework10;

class Lecture extends SuperEntity {
    protected static int count = 0;

    public Lecture() {
        super();
        count++;
    }

    public Lecture(String name, int id) {
        super(name, id);
        count++;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Lecture.count = count;
    }
}


