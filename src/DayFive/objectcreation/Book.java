package DayFive.objectcreation;

public class Book {
    // Properties
    String title;
    String author;
    int yearPublished;

public Book() {
    //Default constructor
    title = "Unknown";
    author = "Unknown";
    yearPublished = 1900;

    }
 public Book(String title, String author, int yearPublished) {
     //Parametrized constructor
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
 }

 public static void main(String[] args) {
    //Creating objects of the Book class

     Book book1 = new Book("Hingede öö", "Karl Ristikivi", 1953);
     Book book2 = new Book("Pisuhänd", "E.Vilde", 1913);
     Book book3 = new Book("Tõde ja õigus","A.H.Tammsaare", 1926);

     book1.details();
     book2.details();
     book3.details();
 }

 private void details(){
     System.out.println("Book details: ");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Year Published: " + yearPublished);
 }
}
