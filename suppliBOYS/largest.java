// . Given three numbers x, y and z of which aim is to get the largest among these three 
// numbers and print the result.
// Input format:
// First line of the input contains 3 space separated numbers entered by the user.
// Output format:
// On a single line of output print the largest number
// 0 <= x,y,z <= 10000000
// Sample Input:
// 5 10 3
// Sample Output:
// 10 is the largest number
// Sample Input:
// 5 5 5
// Sample Output:
// 5 is the largest number

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int larg = x;
        if(y>larg){
            larg = y;
        }
        if(z>larg){
            larg = z;
        }
        System.out.println(larg);
    }
}
