package mylibrary;

public interface LibraryManagement {
    void addBook(Book book);

    Book searchBook(String bookId);

    void viewAllBooks();

    void addMember(Member member);

    Member searchMember(String memberId);

    void viewAllMembers();

    void issueBook(Member member, Book book);

    void returnBook(Member member, Book book);
}

