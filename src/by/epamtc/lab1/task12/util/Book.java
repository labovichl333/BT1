package by.epamtc.lab1.task12.util;

import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private String author;
    private int prise;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int prise, int isbn) {
        this.title = title;
        this.author = author;
        this.prise = prise;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn-o.isbn;
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "title='" + title +
                ", author='" + author +
                ", prise=" + prise +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return prise == book.prise &&
                isbn == book.isbn &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author)+31*prise+31*isbn;
    }
}
