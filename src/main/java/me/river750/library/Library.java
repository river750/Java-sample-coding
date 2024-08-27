package main.java.me.river750.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("『" + book.getTitle() + "』が図書館に追加されました。");
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + "が図書館のメンバーに登録されました。");
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void lendBook(Member member, Book book) {
        member.borrowBook(book);
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }

    public void displayBooks() {
        System.out.println("図書館の本のリスト:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() {
        System.out.println("図書館のメンバーリスト:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("著者に「" + author + "」を含む本:");
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        for (Book book : result) {
            System.out.println(book);
        }
    }

    public void searchByTitle(String title) {
        System.out.println("タイトルに「" + title + "」を含む本:");
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        for (Book book : result) {
            System.out.println(book);
        }
    }

    public void searchByISBN(String isbn) {
        System.out.println("ISBNが" + isbn + "に一致する本:");
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println(book);
            }
        }
    }

    public List<Book> searchAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }
        return result;
    }
}
