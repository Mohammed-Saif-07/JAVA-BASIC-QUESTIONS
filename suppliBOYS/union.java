// Given two arrays A and B of size N and M respectively. The task is to find the number 
// of elements in the union between these two arrays.
// Note - Union of the two arrays can be defined as the set containing distinct elements from both 
// the arrays. If there are repetitions, then only one occurrence of the element should be printed 
// in the union.
// Input Format
// The first line contains two integers N and M denoting the size of two arrays A and B.
// The second line contains the array elements of A as A_1,A_2,...,A_N-1.
// The third line contains the array elements of B as B_1,B_2,...B_N-1.
// Output format
// Print the number of elements in the union between these two arrays A and B.
// Constraints
// 1<=N,M<=100
// 0<=A_i,B_i<=100
// Time Limit
// 1 second
// Example
// Sample Input
// 5 3
// 1 2 3 4 5
// 1 2 3
// Sample Output
// 5

import java.util.*;
public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i = 0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i = 0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int sum = n1+n2;
        for(int i = 0;i<n1;i++){
            for(int j = 0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    sum--;
                }
            }
        }
        System.out.println(sum);
    }
}
