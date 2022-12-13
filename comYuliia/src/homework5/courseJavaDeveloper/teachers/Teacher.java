package homework5.courseJavaDeveloper.teachers;

class Teacher {
    static int teacherCounter = 0;
    String name;
    int id;

    Teacher(String name1, int id1) {
        name = name1;
        id = id1;
        teacherCounter++;
    }
}
