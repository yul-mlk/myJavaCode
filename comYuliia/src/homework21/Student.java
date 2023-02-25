package homework21;

import java.util.Random;

public class Student implements Runnable {
    String name;
    Integer id;
    int randTaskNumber;

    public Student() {
    }


    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    static int getRandNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static int getRandTime(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static int getRandTime1() {
        int min = 8000;
        int max = 14000;
        int diff = max - min;
        Random random = new Random();
        int randTimeForSleep = random.nextInt(diff + 1);
        return randTimeForSleep += min;

    }

    @Override
    synchronized public void run() {
        int min = 1;
        int max = 9;
        Random random = new Random();
        randTaskNumber = random.nextInt(max - min + 1 + min);
        randTaskNumber += min;
        System.out.println(Thread.currentThread().getName() + " Student " + id + " with name " + name + " gets and starts task " + randTaskNumber);
        int min1 = 8000;
        int max1 = 14000;
        int diff = max1 - min1;
        Random random1 = new Random();
        int randTimeForSleep = random1.nextInt(diff + 1);
        randTimeForSleep += min1;
        try {
            Thread.currentThread().sleep(randTimeForSleep);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println(Thread.currentThread().getName() + " Student " + id + " with name " + name + " ends task " + " Time " + randTimeForSleep);

        while (randTimeForSleep < 12000) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        randTimeForSleep++;
        System.out.println("This student failed because time is over");
        System.out.println();
        //notify();
    }
}



