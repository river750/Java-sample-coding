package main.java.me.river750.library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            throw new IllegalStateException("本は利用できません。");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            throw new IllegalStateException("この本はこのユーザーが借りていません。");
        }
    }

    @Override
    public String toString() {
        return "Member [名前: " + name + ", ID: " + id + ", 借りている本の数: " + borrowedBooks.size() + "]";
    }
}
