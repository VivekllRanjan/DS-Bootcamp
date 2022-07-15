package com.vivek;

//https://leetcode.com/problems/flipping-an-image/


import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
       int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }


    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            //reverse array
            for (int i=0; i<(image[0].length+1) / 2; i++){
                int temp = row[i]^1; //XOR any number with 1 to complement it(0 changes to 1 and 1 changes to 0)
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }
}
