package com.vivek;

//https://leetcode.com/problems/missing-number/
//Uses cycle sort

public class MissingNumber {
    public static void main(String[] args) {

    }
    static int missing(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] <arr.length && arr[i] != arr[correct]){ //Ignores number >= N
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }
        for (int k=0;k<arr.length;k++){
            if (arr[k]!=k)
                return k;
        }
        return arr.length;
    }
}
