package by.epamtc.lab1.task3.util;

public class Priter {
    public static void printTable(TableComponent[] table){
        for (int i = 0; i <table.length; i++) {
            System.out.printf("%3f | %3f\n",table[i].getValue(),table[i].getResult());
        }
    }
}
