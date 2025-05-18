// Given an integer array nums find the squares of each number sorted in non-decreasing 
// order.
// Input Format
// First line of input contains an integer n representing the length of array n. Next line contains n array 
// elements.
// Constraints
// 1 <= nums.length <= 10^4
// -10^4 <= nums[i] <= 10^4
// nums is sorted in non-decreasing order.
// Output Format
// A sorted array representing squares of elements of nums array.
// Sample Input
// 5
// -4 -1 0 3 10
// Sample Output
// 0 1 9 16 100

import java.util.*;
public class squares {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};

        for(int i = 0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
