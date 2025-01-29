package circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Task A", 2, "2025-02-01", "end");
        scheduler.addTask(2, "Task B", 1, "2025-02-05", "beginning");
        scheduler.addTask(3, "Task C", 3, "2025-02-10", "end");
        scheduler.displayTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.searchByPriority(2);
        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}
