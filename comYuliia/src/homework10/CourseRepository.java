package homework10;

class CourseRepository extends EntityRepository {
    private static Course[] courses = new Course[3];

    @Override
    protected void addEnt() {
        Course course = new Course("Java developer", 1);
        System.out.println("Amount of added entities is " + course.count);
    }
}

