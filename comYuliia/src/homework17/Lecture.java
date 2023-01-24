package homework17;

public class Lecture {
    Integer id;
    String name;

    public Lecture(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


