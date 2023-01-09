package homework9;

public class CourseRepository {
    static Course[] courses = new Course[3];

    public static Course[] getCourses() {
        return courses;
    }

    public static void main(String[] args) {
        Course course = new Course(1);
        courses[0] = course;
    }
}

