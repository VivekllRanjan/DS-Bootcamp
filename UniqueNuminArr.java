package com.vivek;

//Given an integer array nums where every element appears three times except for one, which appears exactly once.
//https://leetcode.com/problems/single-number-ii/

public class UniqueNuminArr {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,3,4,5,5,5};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int uni = 0;

        //Array to iterate over all the bits of the number in array
        for ( int bitcounter=0; bitcounter<32; bitcounter++){
            int sum = 0; //To store the number of 1 in each bit after addition
            int set = (1<<bitcounter); //This will change as 001,010,100,1000 and so on.
            //set&arr[i] = 1 when that bit is 1
            for ( int i=0; i<arr.length; i++){
                if((arr[i]&set)!=0){
                    //Checks the bit at "bitcounter" position of that number
                    sum++;
                }
            }
            if(sum%3==1){
                //Implies odd number of 1's in that bit position. Thus, extract the 1 to result variable
                uni = uni | set;
            }
        }


        return uni;
    }

}
