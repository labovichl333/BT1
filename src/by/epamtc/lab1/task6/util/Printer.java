package by.epamtc.lab1.task6.util;

public class Printer {
    public static void printMatrix(int[] mas){
        for (int i = 0; i <mas.length; i++) {
            for (int j = i; j <mas.length; j++) {
                System.out.print(mas[j]+" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(mas[j]+" ");
            }


            System.out.println();
        }
    }
}
