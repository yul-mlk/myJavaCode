package homework10;

class Lecture extends SuperEntity{
    private static int count = 0;

    public Lecture() {
        super();
        count++;
    }

    public Lecture(String name, int id) {
        super(name, id);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Lecture.count = count;
    }
}


