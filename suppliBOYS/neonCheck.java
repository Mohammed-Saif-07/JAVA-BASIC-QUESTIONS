// Write a program to check if a number is Neon Number or not and print the result.
// A neon number is a number where the sum of digits of the square of the number is equal to 
// the number. The task is to check and print the neon number.
// Input format:
// First line of the input contains a number entered by the user.
// Output format:
// On a single line of output print if it is a neon number or not
// 0 <= n <= 100
// Sample Input:
// 0
// Sample Output:
// Given number is a Neon number
// Sample Input:
// 8
// Sample Output:
// Given number is not a Neon number

import java.util.*;
public class neonCheck {
    public static boolean check(int n){
        int square = n * n;
        int sum = 0;
        while(square != 0){
            int rem = square % 10;
            sum += rem;
            square /= 10;
        }
        return n == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)){
            System.out.print("neon number");
        }else{
            System.out.println("no ");
        }
    }
}
