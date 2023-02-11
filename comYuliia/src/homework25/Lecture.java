package homework25;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lecture {
    int lectureId;
    String name;
    static int count;
    LocalDateTime creationDate;
    LocalDateTime lectureDate;

    public LocalDateTime getLectureDate() {
        return lectureDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Lecture() {
    }

    public Lecture(int lectureId, String name, LocalDateTime lectureDate) {
        this.lectureId = lectureId;
        this.name = name;
        this.lectureDate = lectureDate;
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

    public static void creationOfLecture(LocalDateTime start, LocalDateTime finish, Period p) {
        LocalDateTime creationDate = start;
        while (creationDate.isBefore(finish)) {
            System.out.println("Next lecture date - " + creationDate);
            creationDate = creationDate.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDateTime lecture1Date = LocalDateTime.of(2023, 2, 6, 19, 30);
        LocalDateTime lecture2Date = LocalDateTime.of(2023, 2, 8, 19, 30);
        LocalDateTime lecture3Date = LocalDateTime.of(2023, 2, 10, 19, 30);
        Lecture lecture1 = new Lecture(1, "Intoduction");
        Lecture lecture2 = new Lecture(2, "Variables");
        Lecture lecture3 = new Lecture(3, "Access modifiers");
        List<Lecture> lectureArrayList = new ArrayList<>();
        lectureArrayList.add(lecture1);
        lectureArrayList.add(lecture2);
        lectureArrayList.add(lecture3);

        DateTimeFormatter formatForLectDate = DateTimeFormatter.ofPattern("MMM d, EEEE HH:mm:ss", Locale.ENGLISH);
        System.out.println("Date of Lecture 1: " + lecture1Date.format(formatForLectDate));
        System.out.println("Date of Lecture 2: " + lecture2Date.format(formatForLectDate));
        System.out.println("Date of Lecture 3: " + lecture3Date.format(formatForLectDate));
        System.out.println("_______________");

        System.out.println("Method with Period (creation of 3 lectures during the week (for testing)): ");
        LocalDateTime start = LocalDateTime.of(2023, 2, 6, 19, 30);
        LocalDateTime finish = LocalDateTime.of(2023, 2, 10, 20, 0);
        Period p = Period.ofDays(2);
        Lecture.creationOfLecture(start, finish, p);
    }
}




