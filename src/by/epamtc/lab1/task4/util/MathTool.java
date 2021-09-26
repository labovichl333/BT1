package by.epamtc.lab1.task4.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MathTool {

    public static boolean isPrimeNumber(int number){
        if (number<2){
            return false;
        }
        if(number==2){
            return true;
        }
        boolean answer=true;
        for (int i = 2; i <number; i++) {
            if(number%i==0){
                answer=false;
                break;
            }
        }

        return answer;
    }
    public static int[] takePrimeNumbersPositions(int[] array){
        List<Integer> list=new LinkedList();
        for (int i = 0; i <array.length; i++) {
            if(isPrimeNumber(array[i])){
                list.add(i);
            }
        }
        int[] answer=new int[list.size()];
        for (int i = 0; i <answer.length; i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}
