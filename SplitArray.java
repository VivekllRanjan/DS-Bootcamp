package com.vivek;

//https://leetcode.com/problems/split-array-largest-sum/submissions/

public class SplitArray {
    public static void main(String[] args) {

    }
    static int splitArray(int[] arr, int m){
        int s = 0;
        int e = 0;
        for (int i :arr) {
            s = Math.max(s, i); //Max element of the array
            e += i; //Sum of all elements in the array
        }
        //We have lower and upper limit of the answer.

        //BS
        while(s<e){
            //Checking mid as potential answer (Max sum in m splits of the array)
            //Try to split array into m parts where max sum of each sub-array is mid
            int mid = s + (e-s)/2;

            //Calculate the number of pieces that you can divide the array in with mid as max sum
            int sum = 0;
            int pieces = 1; //Initial number of pieces


            for (int i : arr){
                if((sum + i) > mid){
                    //Max sum exceed, cannot add further element to the split array (sub-array)
                    sum = i;
                    pieces++; //New sub-array created with mid as max sum
                }
                else {
                    //Continue to add elements to the current sub-array
                    sum += i;
                }
            }
            //We have certain amount of sub-arrays from the above loop. Number of sub-arrays = pieces
            ////
            //We need to check if we have desired amount of sub-arrays
            if (pieces > m) {
                //If we don't have m number of sub-arrays, in this case more sub-arrays than required
                //Find a bigger sub-array sum.
                //Which would increase number of elements per array and hence the number of sub-arrays would decrease
                s = mid + 1;
            }
            else {
                //If we don't have m number of sub-arrays, in this case less sub-arrays than required
                //Find a smaller sub-array sum.
                //Which would decrease number of elements per array and hence the number of sub-arrays would increase
                e = mid;
            }
        }
        return e;
    }
}
