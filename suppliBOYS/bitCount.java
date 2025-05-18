// 7: Write a program that takes an integer N and prints the number of 1 bits it has.
// Input Format
// The one and only line contains an integer N.
// Output format
// Print the number of 1 bits it has.
// Constraints
// 0<=N<=4294967295
// Time Limit
// 1 second
// Example
// Sample Input
// 11
// Sample Output
// 3

import java.util.Scanner;

public class bitCount {
    public static int check(int n){
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(check(n));
    }
}
