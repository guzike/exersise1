package com.gzk;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayOrdererTest {
    @Test
    public void test1_1() {
        int[] arr = new int[]{4,5,9,1,7};
        new ArrayOrdererImpl().sortAscending(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(4, arr[1]);
        Assert.assertEquals(5, arr[2]);
        Assert.assertEquals(7, arr[3]);
        Assert.assertEquals(9, arr[4]);
    }

    @Test
    public void test1_2() {
        int[] arr = new int[]{4,5,9,1,7};
        new ArrayOrdererImpl().sortAscending2(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(4, arr[1]);
        Assert.assertEquals(5, arr[2]);
        Assert.assertEquals(7, arr[3]);
        Assert.assertEquals(9, arr[4]);
    }

    @Test
    public void test2() {
        int[] arr = new int[]{4,5,9,1,7};
        new ArrayOrdererImpl().sortDescending(arr);

        Assert.assertEquals(9, arr[0]);
        Assert.assertEquals(7, arr[1]);
        Assert.assertEquals(5, arr[2]);
        Assert.assertEquals(4, arr[3]);
        Assert.assertEquals(1, arr[4]);
    }

    @Test
    public void test3_1() {
        int[] arr = new int[]{4,5,1,1,7};
        new ArrayOrdererImpl().sortAscending(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(1, arr[1]);
        Assert.assertEquals(4, arr[2]);
        Assert.assertEquals(5, arr[3]);
        Assert.assertEquals(7, arr[4]);
    }

    @Test
    public void test3_2() {
        int[] arr = new int[]{4,5,1,1,7};
        new ArrayOrdererImpl().sortAscending2(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(1, arr[1]);
        Assert.assertEquals(4, arr[2]);
        Assert.assertEquals(5, arr[3]);
        Assert.assertEquals(7, arr[4]);
    }

    @Ignore
    @Test
    public void test_speed() {
        int[] arr1 = generateArray(100000);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        long startTime = System.currentTimeMillis();
        new ArrayOrdererImpl().sortAscending(arr1);
        long endTime = System.currentTimeMillis();

        System.out.println("time1 = " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        new ArrayOrdererImpl().sortAscending2(arr2);
        endTime = System.currentTimeMillis();

        System.out.println("time2 = " + (endTime - startTime));

    }

    private int[] generateArray(int length) {
        Random rnd = new Random();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = rnd.nextInt();
        }
        return res;
    }
}