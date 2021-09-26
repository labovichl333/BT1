package by.epamtc.lab1.task2.run;

import by.epamtc.lab1.task2.util.ZoneTool;

public class Runner {
    public static void main(String[] args) {
        System.out.println(ZoneTool.isInZone(0,0));
        System.out.println(ZoneTool.isInZone(4,3));
        System.out.println(ZoneTool.isInZone(-2,1));
        System.out.println(ZoneTool.isInZone(5.01,4));
        System.out.println(ZoneTool.isInZone(10,4));
    }
}
