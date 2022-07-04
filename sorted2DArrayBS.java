package com.vivek;

import java.util.Arrays;

public class sorted2DArrayBS {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(ArraySearch(arr,15)));
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
            if (matrix[mid][cMid]==target)
                return new int[]{row,mid};
            if (matrix[mid][cMid] == target)
                return new int[]{mid,cMid};
            if (matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        //Now that we have 2 rows, check mid-element of both the 2 rows
        if (matrix[rStart][cMid] == target)
            return new int[]{rStart,cMid};
        if (matrix[rStart +1][cMid] == target)
            return new int[]{rStart+1,cMid};


        //Search in all 4 halves of the 2 rows
        /*{
          1 2 3 4
          5 6 7 8

          2 and 6 were mid-elements, and they were checked above.
          1st Half :[rStart][0] to [rStart][cMid-1]
          2nd Half :[rStart][cMid+1] to [rStart][col-1]
          3rd Half :[rStart+1][0] to [rStart+1][cMid-1]
          4th Half : [rStart+1][cMid+1] to [rStart+1][col-1]
        }*/


        if (target <= matrix[rStart][cMid-1])
            BS(matrix,rStart,0,cMid-1,target);
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1])
            BS(matrix,rStart,cMid+1,col-1,target);
        if (target <= matrix[rStart+1][cMid-1])
            BS(matrix,rStart+1,0,cMid-1,target);
        else
            BS(matrix,rStart+1,cMid+1,col-1,target);
    return new int[]{-1};
    }
}
