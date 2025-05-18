// Andrew manages a pipe warehouse. He wishes to automate the process of transferring 
// the pipes from the warehouse to the carrier truck. There are N pipes with a length of 1 to 9 units 
// placed in the warehouse vertically along a wall. In the automated system, a drone picks the 
// pipes by length and carries them to the carrier truck. In each turn, the drone moves from left to 
// right to find the pipe, whose length is greater than the pipe on its left. After finding the pipe, 
// the drone takes the pipe to the carrier truck. The drone repeats this process until it has no more 
// pipes to pick or no pipe meets the above-said criteria. Write a Java program to output the length 
// of pipes, which will remain in the warehouse after the drone has completed this process.
// Input Format
// The first line of the input consists of an integer - numOfPipes, representing the number of 
// pipes in the warehouse (N).
// The second line consists of N space-separated integers - len[0], len[1], .... len[N-1], 
// representing the length of the pipes.
// Output Format
// Print integers representing the length of the remaining pipes in the warehouse. Don’t print 
// any space between integers
// Sample Input 1
// 5
// 4 5 2 1 3
// Sample Output 1
// 421
// Explanation
// In the first turn, the drone picks the pipe with length 5 as 5 > 4. So, the remaining pipes are 4, 
// 2, 1, and 3.
// In the next turn, the drone picks the pipe with length 3 as 3 > 1. So, the remaining pipes are 
// 4, 2, and 1.


import java.util.Scanner ;

public class andrewDrones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.print(arr[0]);
       int temp = arr[0];
       for(int i = 1;i<n;i++){
        if(arr[i]<temp){
            System.out.print(arr[i]);
            temp = arr[i];
        }
       }

    }
}
 

