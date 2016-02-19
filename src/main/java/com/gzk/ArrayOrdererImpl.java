package com.gzk;

public class ArrayOrdererImpl implements ArrayOrderer {

    ArrayOrdererImpl() {
    }

    public void sortAscending(int[] arr) {
        if (arr != null && arr.length > 0) {

            for (int k = 0; k < arr.length; k++) {
                int temp = arr[k];
                int j = 0;

                for (int i = k; i < arr.length; i++) {
                    if (arr[i] <= temp) {
                        temp = arr[i];
                        j = i;
                    }
                }
                arr[j] = arr[k];
                arr[k] = temp;
            }
        }
    }

    public void sortDescending(int[] arr) {
        if (arr != null && arr.length > 0) {

            for (int k = 0; k < arr.length; k++) {
                int temp = arr[k];
                int j = 0;

                for (int i = k; i < arr.length; i++) {
                    if (arr[i] >= temp) {
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