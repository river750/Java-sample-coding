package main.java.me.river750.library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("『" + title + "』が貸し出されました。");
        } else {
            throw new IllegalStateException("『" + title + "』は既に貸し出されています。");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("『" + title + "』が返却されました。");
    }

    @Override
    public String toString() {
        return "Book [書名: " + title + ", 著者: " + author + ", ISBN: " + isbn + ", 貸出状況: " + (isAvailable ? "利用可能" : "貸出中") + "]";
    }
}
