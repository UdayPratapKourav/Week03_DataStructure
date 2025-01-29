package circularlinkedlist.onlineticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding tickets
        system.addTicket(101, "John Doe", "Avatar 2", "A1", "2025-01-29 10:00");
        system.addTicket(102, "Jane Smith", "Inception", "B5", "2025-01-29 12:30");
        system.addTicket(103, "Alice Johnson", "The Matrix", "C3", "2025-01-29 14:30");

        // Displaying all tickets
        System.out.println("All Tickets:");
        system.displayTickets();

        // Searching for a ticket by customer name
        System.out.println("\nSearching for tickets by customer name 'John Doe':");
        system.searchTicket("John Doe");

        // Removing a ticket
        System.out.println("\nRemoving ticket ID 102:");
        system.removeTicket(102);

        // Displaying all tickets after removal
        System.out.println("\nAll Tickets After Removal:");
        system.displayTickets();

        // Total number of tickets
        System.out.println("\nTotal number of tickets: " + system.getTotalTickets());
    }
}