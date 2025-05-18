// Chitkara University has a huge amount of data of students, they wants to maintain the register 
// of student’s details in alphabetical order, write a JAVA program to help the University to arrange 
// the names in alphabetical order.
// Input Format
// First line inputs consist single integer value that is number of records to entered N,
// Seconds line input consists N String values that is Names of student.
// Output Format
// Output consists N student names in Alphabetical order each in new line.
// Sample Input 1
// 5
// Mahesh Sharma
// Ashish Gil
// Rahul Dhingra
// Aman Gupta
// Mayur Chabra

// Sample Output 1
// Aman Gupta
// Ashish Gil
// Mahesh Sharma
// Mayur Chabra
// Rahul Dhingra

// Sample Input 2
// 3
// Abhishek Pathak
// Varun Nair
// Preenu Tyagi
// Sample Output 2
// Abhishek Pathak
// Preenu Tyagi
// Varun Nair

import java.util.*;
public class noWiseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        String temp;
        for(int i = 0 ;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
