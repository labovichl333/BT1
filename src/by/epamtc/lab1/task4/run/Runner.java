package by.epamtc.lab1.task4.run;

import by.epamtc.lab1.task4.util.MathTool;

public class Runner {
    public static void main(String[] args) {
        int[] array={2,9,56,78,5,2,36,47,25,63};
        int[] positions=MathTool.takePrimeNumbersPositions(array);
        for (int position : positions) {
            System.out.println(position);
        }
    }
}
