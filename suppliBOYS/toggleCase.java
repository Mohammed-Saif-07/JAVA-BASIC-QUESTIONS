// Take as input S, a string. Write a function that toggles the case of all characters in the string. 
// Print the value returned.
// Input Format
// String
// Constraints
// Length of string should be between 1 to 1000.
// Output Format
// String
// Sample Input
// abC
// Sample Output
// ABc
// Explanation
// Toggle Case means to change UpperCase character to LowerCase character and vice-versa.

import java.util.*;

public class toggleCase{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }else{
                System.out.print(Character.toLowerCase(ch));
            }
        }
    
    }
}