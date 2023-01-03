package homework7;

public class LectureService {
    public static void main(String[] args) {
        Course course = new Course(6);
        Lecture lecture1 = new Lecture(course.id);
        Lecture lecture2 = new Lecture(course.id);
        Lecture lecture3 = new Lecture(course.id);
        Lecture lecture4 = new Lecture(course.id);
        Lecture lecture5 = new Lecture(course.id);
        Lecture lecture6 = new Lecture(course.id);
        System.out.println("Total lectures created:" + Lecture.lectureCounter);
        System.out.println();
        System.out.println("Lecture coarse ID is " + lecture6.courseId);
    }
}
