package by.epamtc.lab1.task12.util;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrise()-o2.getPrise();
    }
}