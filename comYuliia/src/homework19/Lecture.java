package homework19;

public class Lecture {
    int lectureId;
    String name;
    static int count;

    public Lecture() {
    }

    public Lecture(int lectureId, String name) {
        this.lectureId = lectureId;
        this.name = name;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
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
                "lectureId=" + lectureId +
                ", name='" + name + '\'' +
                '}';
    }
}
