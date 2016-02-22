package com.gzk;

/**
 * Generic order test class
 */
public class GenericOrderer {

    public static <T extends Comparable<T>> void sortAscending(T[] arr) {
        if (arr != null && arr.length > 0) {

            for (int k = 0; k < arr.length; k++) {
                T temp = arr[k];
                int j = 0;

                for (int i = k; i < arr.length; i++) {
                    if (arr[i].compareTo(temp)<=0) {
                        temp = arr[i];
                        j = i;
                    }
                }
                arr[j] = arr[k];
                arr[k] = temp;
            }
        }
    }
}