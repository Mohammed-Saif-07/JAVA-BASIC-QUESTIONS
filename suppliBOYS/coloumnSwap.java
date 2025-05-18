// Working with 2D arrays is quite important. Here we will do swapping of columns in a 2D array. 
// You are given a matrix M or r rows and c columns. You need to swap the first column with the last 
// column.
// Input format:
// First line contains two integers n and m.
// Next lines contain n*m matrix.
// Output format:
// Print the matrix after modification.
// Sample Input:
// 3 4
// 1 2 3 4
// 4 3 2 1
// 6 7 8 9

// Sample Output:
// 4 2 3 1
// 1 3 2 4
// 9 7 8 6

import java.util.Scanner;

public class coloumnSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i < row; i++) {
            int temp = arr[i][0];
            arr[i][0] = arr[i][col-1];
            arr[i][col-1] = temp;
        }
        for(int i = 0 ; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
