package circularlinkedlist.onlineticketreservationsystem;

class TicketReservationSystem {
    Ticket last;

    public TicketReservationSystem() {
        last = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            last = newTicket;
            last.next = last; // Point to itself to make it circular
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket; // Move last to the new node
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = last.next;
        Ticket previous = last;

        // Traverse the list to find the ticket
        do {
            if (current.ticketId == ticketId) {
                if (current == last) {
                    if (last.next == last) {
                        last = null; // Only one node left
                    } else {
                        previous.next = last.next;
                        last = previous; // Move last to previous node
                    }
                } else {
                    previous.next = current.next;
                }
                System.out.println("Ticket ID " + ticketId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket ID " + ticketId + " not found.");
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchQuery) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchQuery) || current.movieName.equalsIgnoreCase(searchQuery)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found for the search query: " + searchQuery);
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        if (last == null) {
            return 0;
        }

        int count = 0;
        Ticket current = last.next;
        do {
            count++;
            current = current.next;
        } while (current != last.next);

        return count;
    }
}
