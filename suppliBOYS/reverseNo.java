// Suppose you are working on a project that requires you to create a program that takes an 
// integer input from the user and then reverses it. Your program should be able to handle any 
// integer value provided by the user. Your task is to write a program that accepts an integer N 
// and reverses it. The reversed integer should be printed to the console.
// Input format:
// The first line contains an integer T, total number of test cases. Then follow T lines, each line 
// contains an integer N.
// Output format:
// For each test case, display the reverse of the given number N, in a new line.
// Sample Input:
// 2
// 12345
// 31203
// Sample Output:
// 54321
// 30213

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String str1 = String.valueOf(x);
        String str2 = String.valueOf(y);
        for(int i = str1.length()-1;i>=0;i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        for(int i = str2.length()-1;i>=0;i--){
            System.out.print(str2.charAt(i));
        }
    }
}
