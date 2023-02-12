package homework21;

import java.util.ArrayList;
import java.util.List;

public class Task {
    int taskId;

    public Task(int taskId) {
        this.taskId = taskId;

    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public static void main(String[] args) {
        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);
        Task task4 = new Task(4);
        Task task5 = new Task(5);
        Task task6 = new Task(6);
        Task task7 = new Task(7);
        Task task8 = new Task(8);
        Task task9 = new Task(9);
        Task task10 = new Task(10);
        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);
        tasks.add(task7);
        tasks.add(task8);
        tasks.add(task1);
        tasks.add(task10);
    }
}



