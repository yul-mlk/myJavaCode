package homework16;

public class Lecture extends Entity {
    public Lecture(Integer id, String name) {
        super(id, name);
    }

    public Lecture(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Introduction");
        Lecture lecture2 = new Lecture(2, "Variables");
        Lecture lecture3 = new Lecture(3, "Access modifiers");

        Lecture[] arrayLectures = new Lecture[3];
        arrayLectures[0] = lecture1;
        arrayLectures[1] = lecture2;
        arrayLectures[2] = lecture3;
        for (int i = 0; i < arrayLectures.length; i++) {
            System.out.println(arrayLectures[i]);
        }
        System.out.println("******");
        SimpleIterator<Lecture> lectIterator = new SimpleIterator<>(arrayLectures);
        lectIterator.remove(0);
        System.out.println("++++++++");
        for (int i = 0; i < arrayLectures.length; i++) {
            System.out.println(arrayLectures[i]);
        }
    }
}