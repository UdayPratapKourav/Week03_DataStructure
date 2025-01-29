package circularlinkedlist.taskscheduler;

class TaskScheduler {
    private Task head;

    public void addTask(int taskId, String name, int priority, String dueDate, String position) {
        Task newTask = new Task(taskId, name, priority, dueDate);
        //Add first node
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            if ("beginning".equals(position)) {
                Task temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                newTask.next = head;
                temp.next = newTask;
                head = newTask;
            } else {


                Task temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newTask;
                newTask.next = head;
            }
        }
    }

    public void removeTask(int taskId) {
        if (head == null) return;
        Task temp = head, prev = null;
        while (temp.taskId != taskId) {
            if (temp.next == head) {
                System.out.println("Task not found.");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp == head) {
            Task last = head;
            while (last.next != head) {
                last = last.next;
            }
            if (head.next == head) {
                head = null;
            } else {
                head = head.next;
                last.next = head;
            }
        } else {
            prev.next = temp.next;
        }
        System.out.println("Task removed: " + taskId);
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task -> ID: " + temp.taskId + ", Name: " + temp.name);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No task with the given priority.");
        }
    }

    public void viewCurrentTask() {
        if (head != null) {
            System.out.println("Current Task -> ID: " + head.taskId + ", Name: " + head.name + ", Priority: " + head.priority + ", Due Date: " + head.dueDate);
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void moveToNextTask() {
        if (head != null) {
            head = head.next;
            viewCurrentTask();
        }
    }
}
