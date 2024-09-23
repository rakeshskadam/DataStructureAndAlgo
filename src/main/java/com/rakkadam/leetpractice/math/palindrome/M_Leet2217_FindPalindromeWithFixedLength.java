package com.rakkadam.leetpractice.math.palindrome;

import com.rakkadam.Util.Util;

/*
 * @author rakkadam
 * @createdAt 22/09/24
 *
 */
public class M_Leet2217_FindPalindromeWithFixedLength {

    // https://www.youtube.com/watch?v=zAB3NMw53WA
    // https://leetcode.com/problems/find-palindrome-with-fixed-length/description/


    public static void main(String[] args) {
        M_Leet2217_FindPalindromeWithFixedLength obj = new M_Leet2217_FindPalindromeWithFixedLength();
        Util.printLongArr(obj.kthPalindrome(new int[]{1,2,3,4}, 8));
    }
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] result = new long[queries.length];
        int half = (intLength+1)/2;
        long lHalf = (long) Math.pow(10, half-1);
        long rHalf = (long) Math.pow(10, half)-1;

        for(int i=0; i< queries.length; i++) {
            int query = queries[i];
            long maxPalindromes = rHalf - lHalf + 1;
            if(query<=maxPalindromes) {
                String leftHalf = Long.toString(lHalf + query -1);
                String rightHalf = new StringBuilder(leftHalf).reverse().toString();
                long palindrome = Long.parseLong(leftHalf + rightHalf.substring(intLength%2));
                result[i] = palindrome;
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
