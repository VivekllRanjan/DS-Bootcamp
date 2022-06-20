package com.vivek;

//https://leetcode.com/problems/richest-customer-wealth

public class RichestCustWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,2,2,},{3,3,3}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0, sum=0;
        for(int i=0; i<accounts.length; i++)
        {
            sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(max<sum)
                max=sum;
        }
        return max;
    }
}
