package by.epamtc.lab1.task5.util;

public class MathTool {

    public static int countRedundantElements(int[] mas) {
        boolean isSorted=true;
        for (int i = 1; i <mas.length; i++) {
            if(mas[i-1]>mas[i] ){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            return 0;
        }

        int n = mas.length;
        int length = 0;
        final int MIN = -2147483648;
        final int MAX = +2147483647;

        int[] extraArray = new int[n];
        extraArray[0]=MIN;
        for (int i = 1; i < n; i++) {
            extraArray[i] = MAX;
        }

        for (int i = 0; i < n-1; i++) {
            int j=binarySearch(extraArray,0,n-1,mas[i]);
            if (extraArray[j-1]<mas[i] && mas[i] < extraArray[j]){
                extraArray[j]=mas[i];
                length=Math.max(length,j);
            }
        }

        return n-length;
    }

    static int binarySearch(int[] arr, int l, int r, int sElem) {
        int m = -1;
        if (sElem < arr[l])
            return l;
        if (sElem > arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                r = m - 1;
            if (sElem > arr[m])
                l = m + 1;
        }
        return m;
    }
}
