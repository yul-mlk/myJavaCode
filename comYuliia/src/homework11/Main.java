package homework11;

import static homework11.Lecture.*;
import static homework11.Person.createTeacher;
import static homework11.Role.STUDENT;
import static homework11.Role.TEACHER;

public class Main {
    public static void main(String[] args) {

        Lecture.lectures[0] = new Lecture(TEACHER,1);
        Lecture.lectures[1] = new Lecture(STUDENT,1);
        Lecture.lectures[2] = new Lecture(TEACHER,2);
        Lecture.lectures[3] = new Lecture(STUDENT,2);
        Lecture.lectures[4] = new Lecture(STUDENT,3);


        //createTeacher(Role.STUDENT);
        //roleInfo1(2);

        //roleInfo(TEACHER);

        //roleAndIdInfo(TEACHER,2);
    }


}

