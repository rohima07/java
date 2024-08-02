package com.file;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,15,43,56,78,89,90,98,908};
        int target = 908;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;
    }
}
