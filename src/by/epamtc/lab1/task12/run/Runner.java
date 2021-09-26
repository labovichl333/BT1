package by.epamtc.lab1.task12.run;

import by.epamtc.lab1.task12.util.Book;
import by.epamtc.lab1.task12.util.BookAuthorComparator;
import by.epamtc.lab1.task12.util.BookPriceComparator;
import by.epamtc.lab1.task12.util.BookTitleComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Book> list= new ArrayList<>();
        Book book1=new Book("ab","qq",2,5);
        Book book2=new Book("w","qq",8,14);
        Book book3=new Book("ab","aa",24,75);
        Book book4=new Book("c","b",71,15);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        Comparator titleComparator=new BookTitleComparator();
        Comparator titleAuthorComparator=new BookTitleComparator().thenComparing(new BookAuthorComparator());
        Comparator authorTitleComparator=new BookAuthorComparator().thenComparing(new BookTitleComparator());
        Comparator titleAuthorPriceComparator=new BookTitleComparator().thenComparing(new BookAuthorComparator()).thenComparing(new BookPriceComparator());

        System.out.println(list.toString());
        list.sort(titleComparator);
        System.out.println(list.toString());
        list.sort(titleAuthorComparator);
        System.out.println(list.toString());
        list.sort(authorTitleComparator);
        System.out.println(list.toString());
        list.sort(titleAuthorPriceComparator);
        System.out.println(list.toString());
    }
}
