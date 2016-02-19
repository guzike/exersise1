package com.gzk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new ArrayOrdererImpl().sortAscending(new int[]{1,3,1,7,4,6,2});
    }
}