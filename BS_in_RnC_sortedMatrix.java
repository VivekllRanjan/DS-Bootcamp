package com.vivek;

import java.util.Arrays;

public class BS_in_RnC_sortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {18,28,38,48},
                {19,29,39,49}
        };
        System.out.println(Arrays.toString(search(arr,50)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col > 0){
            if (matrix[row][col] == target)
                return new int[] {row,col};
            if (matrix[row][col] < target)
                //As target is larger, ignore the whole row as the other elements in row are also < target
                row++;
            else
                //As target is smaller, ignore the whole row as the other elements in the row are also > target
                col--;
        }
        return new int[] {-1,-1};
    }
}
