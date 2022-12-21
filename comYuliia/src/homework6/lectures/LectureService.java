package homework6.lectures;
public class LectureService {
    public static void main(String[] args) {
        Course id = new Course();
        Course.id = 7;
        Lecture lecture1 = new Lecture(Course.id);
        Lecture lecture2 = new Lecture(Course.id);
        Lecture lecture3 = new Lecture(Course.id);
        Lecture lecture4 = new Lecture(Course.id);
        Lecture lecture5 = new Lecture(Course.id);
        Lecture lecture6 = new Lecture(Course.id);

        System.out.println("Total lectures created:" + Lecture.lectureCounter);
        System.out.println();
        System.out.println("Lecture coarse ID is " + lecture6.courseId);
    }
}


