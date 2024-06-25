package mylibrary;

public class Transaction {
    //member id, book id of the book being issued
    private int memberId;
    private int bookId;
    
    public Transaction() {
    }

    public Transaction(int memberId, int bookId) {
        this.memberId = memberId;
        this.bookId = bookId;
    }

    protected void transactionInformation(){
        System.out.println("Member Id: " + memberId + " ,Book Id: " + bookId);
    }
}
