public class LibrarySystem {
    public static void main(String[] args) {
        // Creating few book objects
        Book book1 = new Book(1, "Java Programming");
        Book book2 = new Book(2, "Python");
        Book book3 = new Book(3, "C# Programming");
        try {
            //Renting book 1
            book1.rentBook();
            //Trying to rent a rented book
            book1.rentBook();  // will throw an exception
        } catch (Exception e) {
            //Handling the exception if the book is already rented
            System.out.println(e.getMessage());
        }

        //Return a book
        book1.returnBook();

        // trying to rent it again after returning
        try {
            book1.rentBook();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Trying to rent other books as well
        try {
            book2.rentBook(); // rent book2
            book3.rentBook();  // rent book3
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
