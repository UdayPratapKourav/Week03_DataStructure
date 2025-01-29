package circularlinkedlist.taskscheduler;

public class Task {
    int taskId;
    String name;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String name, int priority, String dueDate) {
        this.taskId = taskId;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }


}
