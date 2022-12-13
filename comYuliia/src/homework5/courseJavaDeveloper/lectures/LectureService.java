package homework5.courseJavaDeveloper.lectures;

class LectureService {
    public static void main(String[] args) {
        Lecture lecture = new Lecture();
        Lecture lecture2 = new Lecture();
        Lecture lecture3 = new Lecture();

        lecture2.homeWork = "Create two methods";
        lecture3.lectureName = "Methods";

        System.out.println("Total lectures created:" + Lecture.lectureCounter);
        System.out.println();
        System.out.println("Name of the lecture: " + lecture.lectureName);
        System.out.println("Name of the lecture: " + lecture3.lectureName);
        System.out.println("Your home work: " + lecture2.homeWork);


    }
}

