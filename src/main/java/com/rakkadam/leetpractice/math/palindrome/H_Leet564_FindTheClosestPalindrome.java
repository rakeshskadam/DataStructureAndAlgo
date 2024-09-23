package com.rakkadam.leetpractice.math.palindrome;

/*
 * @author rakkadam
 * @createdAt 23/09/24
 *
 */



import java.util.ArrayList;
import java.util.List;

public class H_Leet564_FindTheClosestPalindrome {

    //https://leetcode.com/problems/find-the-closest-palindrome/description/

    public static void main(String[] args) {

        H_Leet564_FindTheClosestPalindrome sol = new H_Leet564_FindTheClosestPalindrome();
        System.out.println(sol.nearestPalindromic("123")); // ans 121
        System.out.println(sol.nearestPalindromic("10"));  // 9
        System.out.println(sol.nearestPalindromic("11"));  // 9
        System.out.println(sol.nearestPalindromic("1805170081")); // 1805115081
    }

    public String nearestPalindromic(String n) {
        int noOfDigits = n.length();
        long actual = Long.parseLong(n);
        int firstHalfLen = (noOfDigits+1)/2;
        int leftStarting = (int) Math.pow(10, firstHalfLen-1);
        long half = Long.parseLong(n.substring(0, firstHalfLen));
        long diff = Integer.MAX_VALUE, resultPal = -1;
        List<Long> possibility = new ArrayList<>();
        possibility.add(getMePalindrome(half, noOfDigits));
        possibility.add(getMePalindrome(half+1, noOfDigits));
        possibility.add(getMePalindrome(half-1, noOfDigits));
        possibility.add((long) Math.pow(10, noOfDigits-1)-1);
        possibility.add((long) Math.pow(10, noOfDigits)+1);

        for (long p: possibility) {
            if(actual == p) {
                continue;
            }
            long tmp = Math.abs(actual-p);
            if(diff>tmp) {
                resultPal = p;
                diff=tmp;
            } else if (resultPal!=p && tmp == diff) {
                resultPal = Math.min(resultPal, p);
            }
        }
       return Long.toString(resultPal);
    }

    public Long getMePalindrome(long firstHalf, int sizeOfPalindrome) {
        String left = Long.toString(firstHalf);
        String right = new StringBuilder(Long.toString(firstHalf)).reverse().toString().substring(sizeOfPalindrome%2);
        return Long.parseLong(left + right);
    }
}
