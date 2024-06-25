package mylibrary;

public class Member {

    private int memberId;
    private String name;
    private String dateOfBirth;
    private int noOfBooksIssued;
    private static final int maxBooksIssued = 3;

    public Member() {
    }

    public Member(int memberId, String name, String dateOfBirth) {
        this.memberId = memberId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.noOfBooksIssued = 0;
    }

    public boolean canIssueBooks() {
        return noOfBooksIssued < maxBooksIssued;
    }

    public void issueBook(Book book, BookList bookList) {
        if (canIssueBooks()) {
            if (book.bookValidity(book, bookList)) {
                if (book.bookAvailability(book)) {
                    noOfBooksIssued++;
                    book.removeCopy();
                    System.out.println("Yor book issued successfuly.....Thank You! " + name + " visit again");
                }
            } else
                System.out.println("Sorry!This book is not available");

        } else {
            System.out.println("Member has reached the maximum limit of issued books.");
        }
    }

    public void returnBook(Book book, BookList bookList) {
        if (book.bookValidity(book, bookList)) {
            noOfBooksIssued--;
            book.addCopy();
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("Sorry! This book was not issued by this member or is invalid.");
        }
    }

    public void memberInfromation() {
        System.out.println("Member Id: " + memberId + " ,Name: " + name + " ,Date of Birth: " + dateOfBirth
                + " No of Book Issued: " + noOfBooksIssued);

    }

}
