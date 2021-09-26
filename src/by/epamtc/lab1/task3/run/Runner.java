package by.epamtc.lab1.task3.run;


import by.epamtc.lab1.task3.util.Priter;
import by.epamtc.lab1.task3.util.TableComponent;
import by.epamtc.lab1.task3.util.WorkWithFunction;

public class Runner {
    public static void main(String[] args) {
        double start=-8;
        double end=12;
        double step=2.3;
        TableComponent[] table;
        table= WorkWithFunction.calculateFunction(start,end,step);
        Priter.printTable(table);
    }
}
