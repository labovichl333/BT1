package by.epamtc.lab1.task3.util;

import java.io.Serializable;


public class TableComponent implements Serializable {
    private double value;
    private double result;

    public TableComponent(double value, double result) {
        this.value = value;
        this.result = result;
    }

    public double getValue() {
        return value;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return Class.class.getSimpleName()+"@"+"{" +
                "vaiue=" + value +
                ", result=" + result +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableComponent table = (TableComponent) o;
        return Double.compare(table.value, value) == 0 &&
                Double.compare(table.result, result) == 0;
    }

    @Override
    public int hashCode() {
        return (int)((37+result)* value);
    }
}
