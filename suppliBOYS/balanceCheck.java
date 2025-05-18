// You are developing a banking application that allows users to withdraw money from their 
// accounts. As part of the withdrawal process, the application needs to check if the requested 
// withdrawal amount is within the available balance. If the withdrawal amount exceeds the balance,
// an exception should be thrown and an appropriate error message should be displayed to the user.
// Write a Java program that handles this exception and provides a user-friendly error message.
// Input Format
// First input consists decimal number, that is available balance,
// Second input consists decimal number, that is withdrawal amount.
// Output Format
// The program will display the appropriate output based on the given input. The output will include 
// information such as the “Withdrawal Successful. Available balance: ????” or “Withdrawal
// Unsuccessful”.
// Sample Input 1
// 500
// 200
// Sample Output 1
// Withdrawal Successful. Available balance: 300.0
// Sample Input 2
// 1000
// 1200
// Sample Output 2
// Withdrawal Unsuccessful


public class balanceCheck {
    public static void main(String[] args) {
        int n = 200;
        int m = 500;
        if(n>m){
            System.out.println("good : "+ (n-m));
        }else{
            System.out.println("unsuccesfull");
        }
    }
}
