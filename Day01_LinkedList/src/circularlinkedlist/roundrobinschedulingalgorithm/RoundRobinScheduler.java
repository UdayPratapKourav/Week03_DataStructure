package circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void removeProcess(int processID) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processID == processID) {
                if (temp == head) {
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (temp == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void executeProcesses() {
        if (head == null) return;
        Process current = head;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;
        System.out.println("Executing processes in Round Robin order:");

        while (head != null) {
            boolean allCompleted = true;
            Process temp = head;
            do {
                if (temp.remainingTime > 0) {
                    allCompleted = false;
                    int executedTime = Math.min(timeQuantum, temp.remainingTime);
                    temp.remainingTime -= executedTime;
                    System.out.println("Process " + temp.processID + " executed for " + executedTime + " units.");
                    if (temp.remainingTime == 0) {
                        System.out.println("Process " + temp.processID + " completed execution.");
                        totalTurnaroundTime += temp.burstTime;
                        removeProcess(temp.processID);
                    }
                }
                temp = temp.next;
            } while (temp != head && !allCompleted);

            if (allCompleted) break;
            processCount++;
        }
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) processCount));
    }

    public void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        System.out.println("Processes in the circular queue:");
        do {
            System.out.println("ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}