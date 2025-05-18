// Q18: Given an array A of positive integers of size N. You are required to reverse every subarray 
// group of size K. Formation of subarray groups will start from the 0th Index of the array, e.g., 
// if the array is of size 5 and K is 3, it will have two subarray groups. The first group will consist 
// of a [0], a[1], and a[2]. The second group will consist of a [3] and a [4].
// Note: If at any instance, there are no more subarrays of size greater than or equal to K, then 
// reverse the last subarray (irrespective of its size). You should not return any array and modify 
// the given array in place.
// Input Format
// The first line contains an integer N denoting the size of the array A and integer K denoting the 
// size of subarray. The next line contains n elements of the array.
// Output format
// Reverse every subarray group of size K and print the array.
// Constraints
// 1 ≤ N, K ≤ 10^4
// 1 ≤ A[i] ≤ 10^4
// Example
// Sample Input
// 5 3
// 1 2 3 4 5
// Sample Output
// 3 2 1 5 4

import java.util.*;;
public class reverseSubArray {
    public static void reverse(int arr[] , int n, int k){
     for(int i = 0;i<n;i+=k){
        int left = i;
        int right = Math.min(i+k-1,n-1);
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, n, k);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
