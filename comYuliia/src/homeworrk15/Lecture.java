package homeworrk15;

public class Lecture {
    String name;
    int id;
    static int count = 0;

    public Lecture(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

