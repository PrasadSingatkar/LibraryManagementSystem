public class Book {
    private int bookId;
    private String title;
    private boolean isAvailable;

    // Constructor to initialize the book details
    public Book(int bookId, String title){
        this.bookId=bookId;
        this.title=title;
        this.isAvailable = true; // Book is Available
    }

    //Method to rent a book
    public void rentBook() throws Exception {
        if(!isAvailable) {   // If the book is already rented
            throw new Exception("Book is not available");
        }
        isAvailable=false;  // Mark the book as rented
        System.out.println(title + " has been rented successfully");
    }

    //Method to return a book
    public void returnBook(){
        isAvailable=true;  //Marking book as Available
        System.out.println(title + " has been returned and is now available");
    }

    //getter for book title
    public String getTitle(){
        return title;
    }


}
