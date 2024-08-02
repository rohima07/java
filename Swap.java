package com.file;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr= {2,6,65,34,78,88};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr));
   }

    static void reverse(int[] arr) {
        int  start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }





//     static int max(int[] arr) {
//        int maxVal = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > maxVal) {
//                 maxVal = arr[i];
//
//             }
//
//         }
//         return maxVal;
//    }
}
