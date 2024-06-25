package mylibrary;

import java.util.ArrayList;
import java.util.List;

public class BookList extends Book{
    List<Book> bookList;

    public BookList() {
        bookList = new ArrayList<Book>();
    }

    /*public BookList(int bookId, String title, int totalCopies) {
        super(bookId, title, totalCopies);
        bookList = new ArrayList<Book>();
    }**/
    public List<Book> getBooks() {
        return bookList;
    }
    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){

        bookList.remove(book);
    }
    public void printBookList(){
        for(Book book: bookList){
            book.bookInformation();
        }
    }
    // public boolean bookValidity(Book book){
    //     for(Book b: bookList){
    //         if(b.getBookId() == book.getBookId()){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public boolean bookAvailability(Book book){
    //     if(book.getAvailableCopies()>0)
    //         return true;
    //     else
    //         return false;
    // }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}
