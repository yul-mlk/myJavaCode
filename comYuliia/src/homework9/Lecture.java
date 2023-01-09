package homework9;

public class Lecture {
    String name;
    int id;
    static int count = 0;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Lecture() {
        count++;
    }

    public Lecture(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }
}

