package homework_14;

public class LectureRepository implements EntityInterface {
    Lecture[] lectures = new Lecture[3];

    public Lecture[] getLectures() {
        return lectures;
    }

    Homework[] arrayHomeworks;

    public static void main(String[] args) {
        Homework homework = new Homework(1, 1, "Set up IDEA");
        Homework homework1 = new Homework(2, 1, "Print and display your name");
        Homework[] arrayHomeworks = new Homework[2];
        arrayHomeworks[0] = homework;
        arrayHomeworks[1] = homework1;
        Homework[] arrayHomeworks1 = new Homework[2];
        Homework[] arrayHomeworks2 = new Homework[2];

        Lecture[] lectures = new Lecture[3];
        Lecture lecture = new Lecture(1, "Intoduction", arrayHomeworks);
        //lectures[0] = new Lecture(1, "Intoduction", arrayHomeworks);
        lectures[1] = new Lecture(2, "Variables", arrayHomeworks1);
        lectures[2] = new Lecture(3, "Constructor", arrayHomeworks2);
    }

    @Override
    public void info() {
        for (int i = 0; i < getLectures().length; i++) {
            System.out.println("Index of array is " + i + ", name is " + getLectures()[i].name + ", id is " + getLectures()[i].id);
            System.out.println(getLectures()[i]);
        }
    }

    @Override
    public void addLecture() {
        System.out.println("Lecture is created");
    }

    @Override
    public void size() {
        System.out.println(getLectures().length);
    }

    @Override
    public void getByIndex(int index) {
        for (int i = 0; i < getLectures().length; i++) {
            if (index == i) {
                System.out.println(getLectures()[i]);
            }
        }
    }
}


