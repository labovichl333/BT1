package by.epamtc.lab1.task7.run;

import by.epamtc.lab1.task7.util.SortTool;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        double[] mas={1,2.5,5,4,35.8,962,48.7,65,12,45,37,85,2,5};
        System.out.println(Arrays.toString(mas));
        SortTool.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
