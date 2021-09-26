package by.epamtc.lab1.task1.util;

public class MathTool {
    public static double countFunction(double x,double y){
        double answer;
        double numerator=1+Math.pow(Math.sin(x+y),2);
        double denominator=2+Math.abs(x-2*x/1+Math.pow(x,2)*Math.pow(y,2));
        answer=numerator/denominator+x;
        return answer;
    }
}
