package homework26;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lecture {
    int lectureId;
    String name;
    LocalDateTime creationDate;
    LocalDateTime lectureDate;

    public Lecture(int lectureId, String name, LocalDateTime creationDate) {
        this.lectureId = lectureId;
        this.name = name;
        this.creationDate = creationDate;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Intoduction", LocalDateTime.of(2022, 12, 29, 19, 30));
        Lecture lecture2 = new Lecture(2, "Variables", LocalDateTime.of(2023, 1, 25, 19, 30));
        Lecture lecture3 = new Lecture(3, "Access modifiers", LocalDateTime.of(2023, 2, 18, 19, 30));
        List<Lecture> lectureList = new ArrayList<>();
        lectureList.add(lecture1);
        lectureList.add(lecture2);
        lectureList.add(lecture3);
        System.out.println("List of lectures :");
        lectureList.forEach(lectures -> System.out.println(lectures));
        System.out.println("__________");
        LocalDateTime finish = LocalDateTime.of(2023, 2, 15, 18, 30);
        LocalDateTime start = LocalDateTime.of(2022, 12, 28, 19, 30);
        System.out.println("Start date: " + start);
        System.out.println("Finish date: " + finish);
        System.out.println("_______");
        System.out.println("Lectures after start date: ");
        lectureList.stream().filter(lecture -> lecture.getCreationDate().isAfter(start)).
                forEach(lectureDate -> System.out.println(lectureDate));
        System.out.println("__________");
        System.out.println("Lectures before finish date: ");
        lectureList.stream().filter(lecture -> lecture.getCreationDate().isBefore(finish)).
                forEach(System.out::println);
        System.out.println("__________");
        lectureList.stream().filter(lecture -> lecture.getCreationDate().isBefore(LocalDateTime.now())).
                forEach(lectureDate -> System.out.println("Lectures until now: " + lectureDate));
        System.out.println("__________");
        lectureList.stream().filter(lecture -> lecture.getCreationDate().isAfter(LocalDateTime.of(2023, 2, 2, 12, 30))).
                forEach(lectureDate -> System.out.println("Lectures after a specific date: " + lectureDate));
        System.out.println("_____******_____");
        System.out.println("With another method");
        Predicate<Lecture> pr1 = lecture -> lecture.getCreationDate().isBefore(finish);
        Predicate<Lecture> pr2 = lecture -> lecture.getCreationDate().isAfter(start);

        List<Lecture> result1 = lectureList.stream().filter(pr1).toList();
        System.out.println("Lectures before finish date: " + result1);
        System.out.println("_________");
        List<Lecture> result2 = lectureList.stream().filter(pr2).toList();
        System.out.println("Lectures after start date: " + result2);
        System.out.println("_________");
        List<Lecture> result = lectureList.stream().filter(pr1.and(pr2)).toList();
        System.out.println("Lectures between  start and finish dates : " + result);
        System.out.println("_________");
    }
}
