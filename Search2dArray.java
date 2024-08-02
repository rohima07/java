package com.file;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {78,6,76},
                {67,65},
                {54,23,12,45},

        };
        int target = 65;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr,int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};

    }
}
