package by.epamtc.lab1.task7.util;

public class SortTool {

    public static void sort(int[] array) {
        int h = 1;
        while (h*3 < array.length){
            h = h * 3 + 1;
        }


        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private static void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    private static void swap(int[] array, int j, int i) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
