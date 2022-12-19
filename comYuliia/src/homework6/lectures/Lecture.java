package homework6.lectures;

public class Lecture {
    static int lectureCounter = 0;
    public int courseId;

    Lecture(int courseId1) {
        courseId = courseId1;
        lectureCounter++;
    }
}



