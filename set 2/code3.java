import mylibrary.*;
import java.util.*;

public class code3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create books
        System.out.println("Enter details for Book 1:");
        Book book1 = createBook(scanner);
        System.out.println("Enter details for Book 2:");
        Book book2 = createBook(scanner);

        // Create book list
        BookList comics = new BookList();
        comics.addBook(book1);
        comics.addBook(book2);

        // Create members
        System.out.println("Enter details for Member 1:");
        Member m1 = createMember(scanner);
        System.out.println("Enter details for Member 2:");
        Member m2 = createMember(scanner);

        // Create member list
        MemberList members = new MemberList();
        members.addMember(m1);
        members.addMember(m2);

        // Issue and return books
        m1.issueBook(book1, comics);
        m1.returnBook(book1, comics);

        // Close scanner
        scanner.close();
    }


    public static Book createBook(Scanner scanner) {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter total copies: ");
        int totalCopies = scanner.nextInt();
        scanner.nextLine();
        return new Book(bookId, title, totalCopies);
    }

    public static Member createMember(Scanner scanner) {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member date of birth (DD/MM/YYYY): ");
        String dateOfBirth = scanner.nextLine();
        return new Member(memberId, name, dateOfBirth);
    }

}