// Q16. Write a program in Java to convert a given decimal number to binary form and print the
// resultant number.
// Input format:
// First line of the input contains a single decimal input number entered by the user.
// 0 <= n <= 10000000
// Output format:
// DO NOT WRITE ANYTHING ON QUESTION PAPER EXCEPT ROLL NO.
// CA109/2022 5 -2023
// On a single line of output print the binary number as a String
// Sample Input:
// 7
// Sample Output:
// 111 



import java.util.Scanner;

public class decToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary ="";
        if(n==0){
            System.out.println(0);
        }while(n>0){
            binary = (n%2) + binary;
            n/=2;
        }
        System.out.println(binary);
    }
}
