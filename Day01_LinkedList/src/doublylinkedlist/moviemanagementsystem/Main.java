


package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the MovieLinkedList
        MovieLinkedList movieList = new MovieLinkedList();

        // Add movies at the end of the list
        System.out.println("Adding movies at the end of the list...");
        movieList.addAtLast("Inception", "Christopher Nolan", "2010", 9);
        movieList.addAtLast("The Matrix", "The Wachowskis", "1999", 10);
        movieList.addAtLast("Interstellar", "Christopher Nolan", "2014", 8);

        // Print the current movie list
        System.out.println("\nCurrent Movie List:");
        movieList.printList();

        // Add a movie at the beginning
        System.out.println("\nAdding a movie at the beginning...");
        movieList.addAtBeginning("The Dark Knight", "Christopher Nolan", "2008", 10);
        movieList.printList();

        // Add a movie at a specific position
        System.out.println("\nAdding a movie at position 3...");
        movieList.addAtPosition(3, "Avatar", "James Cameron", "2009", 8);
        movieList.printList();

        // Search for movies by director
        System.out.println("\nSearching for movies by director 'Christopher Nolan'...");
        movieList.searchMovieByDirector("Christopher Nolan");

        // Update the rating of a movie
        System.out.println("\nUpdating the rating of 'Avatar' to 9...");
        movieList.updateMovieRating("Avatar", 9);
        movieList.printList();

        // Remove a movie by its title
        System.out.println("\nRemoving the movie 'The Matrix'...");
        movieList.removeByMovieTitle("The Matrix");
        movieList.printList();

        // Print the movie list from the end
        System.out.println("\nPrinting the movie list from the end...");
        movieList.printFromLast();

        // Attempt to search for a non-existent movie
        System.out.println("\nSearching for a non-existent movie by director 'Steven Spielberg'...");
        movieList.searchMovieByDirector("Steven Spielberg");

        // Attempt to remove a non-existent movie
        System.out.println("\nAttempting to remove a non-existent movie 'Titanic'...");
        movieList.removeByMovieTitle("Titanic");

        // Attempt to update a non-existent movie's rating
        System.out.println("\nAttempting to update the rating of a non-existent movie 'Titanic'...");
        movieList.updateMovieRating("Titanic", 10);

        // Print the final movie list
        System.out.println("\nFinal Movie List:");
        movieList.printList();
    }
}
