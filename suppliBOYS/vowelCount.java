// Write a program that takes a string input and returns the number of vowels in the string. The program 
// should handle exceptions that may occur during input or processing.
// Input format:
// A single string input.
// Output format:
// An integer representing the number of vowels in the input string.
// Sample Input 1:
// "Hello, World!"
// Sample Output 1:
// 3
// Sample Input 2:
// "bcd"
// Sample Output 2:
// 0

import java.util.Scanner;

public class vowelCount {
    public static int check(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
            || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(check(str));
    }
}
