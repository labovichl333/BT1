package by.epamtc.lab1.task3.util;

public class WorkWithFunction {
    public static TableComponent[] calculateFunction(double start, double end, double step){
        int sizeOfArray=(int)Math.ceil((end-start)/step);
        if(Math.ceil((end-start)/step)==(end-start)/step){
            sizeOfArray++;
        }
        TableComponent[] answer=new TableComponent[sizeOfArray];
        int counter=0;
        for (double i = start; i <=end; i+=step,counter++) {
            answer[counter]=new TableComponent(i,Math.tan(i));
        }
        return answer;
    }

}
