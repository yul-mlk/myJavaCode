package homework30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture {
    int lectureId;
    String name;
    static int count;
    String teacherSurname;

    public Lecture() {
    }

    public Lecture(int lectureId, String name, String teacherSurname) {
        this.lectureId = lectureId;
        this.name = name;
        this.teacherSurname = teacherSurname;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Lecture.count = count;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", name='" + name + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Lecture lecture1 = new Lecture(1, "Intoduction", "Ivanenko");
        Lecture lecture2 = new Lecture(2, "Variables", "Petrenko");
        Lecture lecture3 = new Lecture(3, "Access modifiers", "Vasilenko");
        List<Lecture> lectureList = new ArrayList<>();
        lectureList.add(lecture1);
        lectureList.add(lecture2);
        lectureList.add(lecture3);

        //30,1
        List<String> resultList = lectureList.stream().map(lecture -> lecture.getTeacherSurname()).sorted().toList();
        System.out.println(resultList);
        System.out.println("______________");
        lectureList = lectureList.stream()
                .sorted((a, b) -> a.getTeacherSurname().compareTo(b.getTeacherSurname()))
                .collect(Collectors.toList());
        System.out.println(lectureList);

    }
}
