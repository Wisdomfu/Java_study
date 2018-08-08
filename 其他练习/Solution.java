package ∆‰À˚¡∑œ∞;

import java.util.Arrays;
public class Solution {
    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] C=new int[A.length+B.length];
        System.arraycopy(A,0,C,0,A.length);
        System.arraycopy(B,0,C,A.length,B.length);
        return C;
    }
    public static void main(String[] args){
        int[] A=new int[]{7};
        int[] B=new int[]{5,7};
        int[] C=new int[A.length+B.length];
        C= mergeSortedArray(A, B);
        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
    }
}