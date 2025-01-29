package doublylinkedlist.moviemanagementsystem;

public class Movie {
    String movieTitle;
    String director;
    String yearOfRelease;
    int rating;
    Movie next;
    Movie prev;

    Movie(String movieTitle,String director,String yearOfRelease,int rating){
        this.movieTitle=movieTitle;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }

    public void printDetails(){
        System.out.println("Movie title is :"+movieTitle);
        System.out.println("Movie director is :"+director);
        System.out.println("Movie yearOfRelease :"+yearOfRelease);
        System.out.println("Rating is :"+rating);
    }

}
