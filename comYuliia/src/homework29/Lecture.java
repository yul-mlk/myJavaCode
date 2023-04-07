package homework29;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecture {
    int lectureId;
    String name;
    LocalDateTime lectureDate;
    int AdditionalMaterialsCount;

    public Lecture(int lectureId, String name, LocalDateTime lectureDate, int additionalMaterialsCount) {
        this.lectureId = lectureId;
        this.name = name;
        this.lectureDate = lectureDate;
        AdditionalMaterialsCount = additionalMaterialsCount;
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

    public LocalDateTime getLectureDate() {
        return lectureDate;
    }

    public void setLectureDate(LocalDateTime lectureDate) {
        this.lectureDate = lectureDate;
    }

    public int getAdditionalMaterialsCount() {
        return AdditionalMaterialsCount;
    }

    public void setAdditionalMaterialsCount(int additionalMaterialsCount) {
        AdditionalMaterialsCount = additionalMaterialsCount;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", name='" + name + '\'' +
                ", lectureDate=" + lectureDate +
                ", AdditionalMaterialsCount=" + AdditionalMaterialsCount +
                '}';
    }

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Intoduction", LocalDateTime.of(2022, 12, 29, 19, 30), 4);
        Lecture lecture2 = new Lecture(2, "Variables", LocalDateTime.of(2023, 1, 25, 19, 30), 3);
        Lecture lecture3 = new Lecture(3, "Access modifiers", LocalDateTime.of(2023, 2, 18, 19, 30), 5);
        Lecture lecture4 = new Lecture(4, "Generics", LocalDateTime.of(2023, 3, 15, 19, 30), 4);
        List<Lecture> lectureList = new ArrayList<>();
        lectureList.add(lecture1);
        lectureList.add(lecture2);
        lectureList.add(lecture3);
        lectureList.add(lecture4);
        System.out.println("List of lectures :");
        lectureList.forEach(lectures -> System.out.println(lectures));
        System.out.println("______________");
        Lecture maxAdMat = lectureList.stream().max((a, b) -> a.getAdditionalMaterialsCount() - b.getAdditionalMaterialsCount()).get();
        System.out.println("Lecture with max amount of additional materials: " + maxAdMat);
        System.out.println("______________");
        Lecture resultLecture = lectureList.stream().sorted(Comparator.comparing(Lecture::getLectureDate)
                        .reversed()
                        .thenComparing(Lecture::getAdditionalMaterialsCount)
                        .reversed())
                .findFirst().orElse(null);
        if (resultLecture != null) {
            System.out.println("The first created lecture with max amount of additional materials: " + resultLecture);
        }
    }
}


