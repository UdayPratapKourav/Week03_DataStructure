package singlylinkedlist.studentrecordmanagement;

//Main class
public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addBeginning(123,"uday",20,"A");
        list.addEnd(124,"udayPratap",21,"A");
        list.addAtPosition(2,1235,"kourav",25,"C");

        // Displaying all student records
        list.displayAll();

        // Searching for a student
        list.searchByRollNumber(123);

        // Updating a student's grade
        list.updateGrade(124, "z");

        // Deleting a student
        list.deleteByRollNumber(100);

        // Displaying all records after deletion
        list.displayAll();
    }
}
