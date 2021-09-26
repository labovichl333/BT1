package by.epamtc.lab1.task2.util;

public class ZoneTool {
    public static boolean isInZone(double coordinateX,double coordinateY){
        boolean answer=false;
        if(coordinateY>=-3 && coordinateY<=0 && Math.abs(coordinateX)<=6){
            answer=true;
        }
        if(coordinateY<=5 && coordinateY>=0 && Math.abs(coordinateX)<=4){
            answer=true;
        }
        return answer;
    }
}
