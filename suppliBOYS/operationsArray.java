// Write a program in Java to implement an integer array and perform following operations 
// in form of functions one after another in same sequence as mentioned: 
 
// 1. 
// Create an integer array having length of five (05) elements. 
//  2. 
// Input all five elements one after another. 
//  3. 
// Find maximum element from the input array. 
//  4. 
// Find minimum element from the input array. 
//  5. 
// Find Subtraction of all elements of the input array consecutively, i.e., Subtract 
// second element from first, third element from result obtained from last subtraction and 
// so on. 
// a. Print message “Subtraction result is greater than or equal to Zero”, if subtraction 
// result is positive or zero. 
// b. Print message “Subtraction result is less than Zero”, if subtraction result is less 
// than zero. 
// Input format: 
// First line of the input contains elements of array of five integers separated with a space. 
// Constraints: 
// Entered elements should be greater than 0 and lesser than 10 (1>= Arr[i] >= 9) 
// Output format: 
// Output contains the following 
// 1. Maximum element of input array,
// 2. Minimum element of input array, 
// 3. Result of consecutive subtraction as discussed above 
// 4. Do the following based on result of consecutive subtraction, 
// a. If subtraction result is zero or positive, then print message “Subtraction result is 
// greater than or equal to Zero”, and 
// b. If subtraction result is negative, then print message “Subtraction result is less 
// than Zero”, 
// Sample Input 1: 
// 1 2 3 4 5 
// Sample Output 1: 
// 5 
// 1 
// -13 
// Subtraction result is less than Zero 
// Explanation: 
// 1. Code should able to identify maximum and minimum elements of input array as 5 and 
// 1 shown in above example. 
// 2. Code should able to find subtraction and also able to print message as discussed above. 
// For example: If array elements are 1 2 3 4 5 then 
// 1 - 2 = - 1 
// -1 - 3 = - 4 
// -4 - 4 = - 8 
// -8 - 5 = - 13


import java.util.*;

public class operationsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println(max);
        System.out.println(min);

        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            res -= arr[i];
        }
        System.out.println(res);
        
        if(res >= 0) {
            System.out.println("java.lang.Exception: Subtraction is greater than equal to Zero");
        } else {
            System.out.println("java.lang.Exception: Subtraction is less than Zero");
        }
    }
}
