package homework12;

public class Course {
    String name1 = "Java developer";
    String name2 = "JavaScript developer";
    String name3 = "Pyton developer";
    String name4 = "C++ developer";

    public Course(String name1, String name2, String name3, String name4) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", name4='" + name4 + '\'' +
                '}';
    }
}
