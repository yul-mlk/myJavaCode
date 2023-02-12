package homework21;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Control work has started");

        Student student1 = new Student("Alex", 1);
        Student student2 = new Student("Olga", 2);
        Student student3 = new Student("Inga", 3);
        Student student4 = new Student("Agnia", 4);
        Student student5 = new Student("Visvald", 5);
        Student student6 = new Student("Artur", 6);
        Student student7 = new Student("Alina", 7);
        Student student8 = new Student("Max", 8);
        Student student9 = new Student("Den", 9);
        Student student10 = new Student("Yulia", 10);

        Thread threadForSt1 = new Thread(student1);
        threadForSt1.start();

        Thread threadForSt2 = new Thread(student2);
        threadForSt2.start();

        Thread threadForSt3 = new Thread(student3);
        threadForSt3.start();

        Thread threadForSt4 = new Thread(student4);
        threadForSt4.start();

        Thread threadForSt5 = new Thread(student5);
        threadForSt5.start();

        Thread threadForSt6 = new Thread(student6);
        threadForSt6.start();

        Thread threadForSt7 = new Thread(student7);
        threadForSt7.start();

        Thread threadForSt8 = new Thread(student8);
        threadForSt8.start();

        Thread threadForSt9 = new Thread(student9);
        threadForSt9.start();

        Thread threadForSt10 = new Thread(student10);
        threadForSt10.start();
    }
}