// Stair Case

// A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count and return all possible ways in which the child can run-up to the stairs.
// Input format :
// The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
// Output format :
// Print the total possible number of ways.
//  Constraints :
// 0 <= n <= 10 ^ 4

// Time Limit: 1 sec
// Sample Input 1:
// 4
// Sample Output 1:
// 7
// Sample Input 2:
// 10
// Sample Output 2:
// 274


package RECURSION2;

public class childStair {
    public static int step(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        if( n == 2){
            return 2;
        }
        return step(n-1) + step(n-2) + step(n-3);
    }


public static void main(String[] args){
    int n = 4;
    System.out.println(step(n));
}
}