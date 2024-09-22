package com.rakkadam.Util;

/*
 * @author rakkadam
 * @createdAt 22/09/24
 *
 */

public class Util {

    public static void printLongArr(long[] arr) {
        StringBuilder sb =  new StringBuilder("[");
        for (long i: arr) {
            sb.append(i).append(", ");
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        sb.append("]");
        System.out.println(sb.toString());
    }
}
