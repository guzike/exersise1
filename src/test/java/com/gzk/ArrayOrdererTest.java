package com.gzk;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOrdererTest {
    @Test
    public void test1() {
        int[] arr = new int[]{4,5,9,1,7};
        new ArrayOrdererImpl().sortAscending(arr);

        Assert.assertEquals(1, arr[0]);
        Assert.assertEquals(4, arr[1]);
        Assert.assertEquals(5, arr[2]);
        Assert.assertEquals(7, arr[3]);
        Assert.assertEquals(9, arr[4]);
    }
}