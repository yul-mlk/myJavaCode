package homework8;

public class Lecture {
    public static int lectureCounter = 0;
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
