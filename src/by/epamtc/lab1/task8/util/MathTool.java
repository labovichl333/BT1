package by.epamtc.lab1.task8.util;

public class MathTool {
    public static void printIndexes(double masA[], double masB[]) {
        for (int i = 0; i < masB.length; i++) {
            System.out.print(binarySearch(masA, 0, masA.length - 1, masB[i])+" ");
        }
    }

    static double binarySearch(double[] arr, int l, int r, double sElem) {
        int m = -1;
        if (sElem <= arr[l])
            return l;
        if (sElem >= arr[r])
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
