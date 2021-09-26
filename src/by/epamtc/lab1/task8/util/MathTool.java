package by.epamtc.lab1.task8.util;

public class MathTool {
    public static void printIndexes(int masA[], int masB[]) {
        for (int i = 0; i < masB.length; i++) {
            System.out.print(binarySearch(masA, 0, masA.length - 1, masB[i])+" ");
        }
    }

    static int binarySearch(int[] arr, int l, int r, int sElem) {
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
