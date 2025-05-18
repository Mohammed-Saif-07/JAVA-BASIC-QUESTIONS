// Q17. Write a program in java to print Armstrong number between two input numbers.
// An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth
// power is equal to the number itself.
// Input format:
// First line of the input contains two input numbers entered by the user.
// Output format:
// On a single line of output print the Armstrong numbers separated by space
// CA109/2022 6 -2023
// n1 < n < n2
// 1 < n < 10000
// Sample Input:
// 5 20
// Sample Output
// 6 7 8 9


import java.util.Scanner;

public class armstrongNo {
    public static boolean isArm(int n){
        int len = String.valueOf(n).length();
        int original = n;
        int result  = 0;
        while(original != 0){
            int remainder = original % 10;
            result += Math.pow(remainder,len);
            original /= 10;
        }
        return result == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
       for(int i = n1 + 1;i<n2;i++){
        if(isArm(i)){
            System.out.print(i+" ");
        }
       }
    }
}
