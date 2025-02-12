package com.vivek;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {2,8,4,16,12,4};
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
