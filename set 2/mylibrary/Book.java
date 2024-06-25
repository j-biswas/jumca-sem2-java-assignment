package mylibrary;
import java.util.List;

public class Book {
    //book id, title, total number of copies purchased, and number of copies currently available
    int bookId;
    String title;
    int totalCopies;
    int availableCopies;
    
    public Book() {
    }
    public Book(int bookId, String title, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public void addCopies(int copies) {
        totalCopies += copies;
        availableCopies += copies;
    }
    public void removeCopies(int copies) {
        totalCopies -= copies;
        availableCopies -= copies;
    }
    public void removeCopy(){
        availableCopies--;
    }
    public void addCopy(){

        availableCopies++;
    }
    public void bookInformation(){
        System.out.println("Book ID: " + bookId + " ,Title: " + title + " ,Total Copies: " + totalCopies + " ,Available Copies: " + availableCopies);
    }
    public int getBookId() {
        return bookId;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public boolean bookValidity(Book book, BookList bookList) {
        List<Book> books = bookList.getBooks();
        for(Book b: books){
            if(b.getBookId() == book.getBookId()){
                return true;
            }
        }
        return false;
    }
    public boolean bookAvailability(Book book){
        if(book.getAvailableCopies()>0)
            return true;
        else
            return false;
    }
    
}
