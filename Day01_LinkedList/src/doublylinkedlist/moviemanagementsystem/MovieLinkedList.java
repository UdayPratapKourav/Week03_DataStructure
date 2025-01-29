package doublylinkedlist.moviemanagementsystem;

public class MovieLinkedList {

    Movie head;
    Movie tail=head;
      //Mehthod for add at last
       public void addAtLast(String movieTitle,String director,String yearOfRelease,int rating){
           Movie newMovie=new Movie(movieTitle,director,yearOfRelease,rating);
           if(head==null){
               head=newMovie;
               tail=newMovie;
               return;
           }

           tail.next=newMovie;
           newMovie.prev=tail;
           tail=newMovie;

//
//           Movie temp=head;
//           while (temp.next!=null){
//               temp=temp.next;
//           }
//           temp.next=newMovie;
//           newMovie.prev=temp;
//           tail=newMovie;





       }

       public void addAtBeginning(String movieTitle,String director,String yearOfRelease,int rating){
           Movie newMovie=new Movie(movieTitle,director,yearOfRelease,rating);
           if(head==null){
               head=tail=newMovie;
               return;
           }
           newMovie.next=head;
           head.prev= newMovie;
           head = newMovie;


       }

    public void addAtPosition(int position, String movieTitle, String director, String yearOfRelease, int rating) {
        Movie newMovie = new Movie(movieTitle, director, yearOfRelease, rating);

        // If adding at the beginning
        if (position == 1) {
            addAtBeginning(movieTitle, director, yearOfRelease, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        // If adding at the end
        if (temp == tail) {
            addAtLast(movieTitle, director, yearOfRelease, rating);
            return;
        }

        // Add in the middle
        newMovie.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        }
        temp.next = newMovie;
        newMovie.prev = temp;
    }


    //Method for removing movie by using it's title
      public void removeByMovieTitle(String movieTitle) {
          if (head == null) {
              System.out.println("List is empty");
              return;
          }

          Movie temp = head;

          while (temp != null) {
              if (temp.movieTitle.equals(movieTitle)) {

                  // If the node to remove is the head
                  if (temp == head) {
                      head = temp.next;
                      if (head != null) {
                          head.prev = null;
                      }
                  }
                  // If the node to remove is the tail
                  else if (temp == tail) {
                      tail = temp.prev;
                      tail.next = null;
                  }
                  // If the node is in the middle
                  else {
                      temp.prev.next = temp.next;
                      temp.next.prev = temp.prev;
                  }

                  System.out.println(movieTitle + " deleted");
                  return;
              }
              temp = temp.next;
          }

          System.out.println("Movie not found");
      }

    //Method for searching the movie details using director name
       public void searchMovieByDirector(String director){
           Movie temp = head;
           boolean found=false;
           while(temp!=null){
               if(temp.director.equals(director)){
                   temp.printDetails();
                   found=true;

               }
               temp=temp.next;
           }
           if(!found){
               System.out.println("No movie found for director "+director);
           }
       }


      //Method for printing all the list from starting
       public void printList(){
          if(head==null){
              System.out.println("List is empty!");
              return;
          }

           Movie temp = head;
           while (temp!=null){
               temp.printDetails();
               temp=temp.next;
           }

       }
      //Method for printing all the list form end
       public void printFromLast(){
           if(tail==null){
               System.out.println("List is empty");
               return;
           }
           Movie temp=tail;
           while (temp!=null){
               temp.printDetails();
               temp=temp.prev;
           }
       }


       //Updating rating with the help of movie title
       public void updateMovieRating(String title,int updatedRating){
           Movie temp = head;
           while(temp!=null){
               if(temp.movieTitle.equals(title)){
                   temp.rating=updatedRating;
               }
               temp=temp.next;
           }
       }




}
