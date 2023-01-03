package homework7;

public class Lecture {
    static int lectureCounter = 0;
    public int courseId;
    public String name;

    public Lecture(int courseId) {
        this.courseId = courseId;
        lectureCounter++;
    }

    public Lecture(int courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }
}
