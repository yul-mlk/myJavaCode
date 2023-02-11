package homework25;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Homework {
    Double id;
    String task;

    public LocalDateTime getDeadline() {
        return deadline;
    }

    LocalDateTime deadline;

    public Homework(Double id, String task) {
        this.id = id;
        this.task = task;
    }

    public Double getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }

    public static void createDeadline(LocalDateTime lectureDate) {
        LocalDateTime deadline = lectureDate.plusHours(16).plusMinutes(30);
        DateTimeFormatter deadlineFormatDay = DateTimeFormatter.ofPattern("MMM d, HH:mm", Locale.ENGLISH);
        System.out.println("Time of deadline " + deadline.format(deadlineFormatDay));
    }

    public static void createDeadline1(LocalDateTime lectureDate, Duration d, Duration d1) {
        LocalDateTime deadline = lectureDate.plus(d).plus(d1);
        DateTimeFormatter deadlineFormatDay = DateTimeFormatter.ofPattern("MMM d, HH:mm", Locale.ENGLISH);
        System.out.println("Time of deadline " + deadline.format(deadlineFormatDay));
    }

    public static void main(String[] args) {
        LocalDateTime lectureDate1 = LocalDateTime.of(2023, Month.FEBRUARY, 10, 19, 30);
        DateTimeFormatter formatForLectDate = DateTimeFormatter.ofPattern("MMM d, EEEE HH:mm:ss", Locale.ENGLISH);
        System.out.println("Time of lecture " + lectureDate1.format(formatForLectDate));
        createDeadline(lectureDate1);
        System.out.println("__________________________________");
        System.out.println("Method with Duration (just for testing): ");
        LocalDateTime lectureDate2 = LocalDateTime.of(2023, Month.FEBRUARY, 13, 19, 30);
        Duration d = Duration.ofHours(16);
        Duration d1 = Duration.ofMinutes(30);
        System.out.println("Time of lecture " + lectureDate2.format(formatForLectDate));
        createDeadline1(lectureDate2, d, d1);
    }
}
