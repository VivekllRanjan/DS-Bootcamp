package com.vivek;

public class sorted2DArrayBS {
    public static void main(String[] args) {

    }

    //BS in the given row in the column range

    static int[] BS(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart > cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (target == matrix[row][mid])
                return new int[]{row,mid};
            if (target > matrix[row][mid])
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[]{-1,-1};
    }


    static int[] ArraySearch(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if(row==1)
                return BS(matrix,0,0,col-1,target);

        int rStart = 0;
        int rEnd = row -1;
        int cMid = col/2;

        //Run loop until 2 rows left
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
        }
    }
}
