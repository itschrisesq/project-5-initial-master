package com.example.sorting;

public class SortingUtility {

    /**
            method gnomeSort(a[])
             pos = 0
            while pos < length(a)
                if (pos == 0 or a[pos] >= a[pos-1])
                    pos = pos + 1
                else
                    swap a[pos] and a[pos-1]
                        pos = pos - 1
     */

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int n = 0;

        while (n < data.length) {
            if (n == 0 || data[n].compareTo(data[n - 1]) > 0) {
                n = n + 1;
            }

            else {
                T temp = data[n];
                data[n] = data[n - 1];
                data[--n] = temp;
            }
        }
    }


    /**
            method gnomierSort(a[])
                for pos in 1 to length(a)
                    gnomierSort(a, pos)
     */

    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        for (int n = 0; n < data.length; n++) {
            gnomierSort(data, n);
        }

    }

    /**
             method gnomierSort(a[], upperBound)
                pos = upperBound
                while pos > 0 and a[pos-1] > a[pos]
                    swap a[pos-1] and a[pos]
                    pos = pos - 1
     */

    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        int n = upperBound;

        while (n > 0 && data[n].compareTo(data[n - 1]) < 0) {
            T temp = data[n];
            data[n] = data[n - 1];
            data[--n] = temp;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}