// Take as input S, a string. Write a function that does basic string compression. Print the value returned. 
// E.g. for input “aaabbccds” print out a3b2c2d1s1.
// Input Format
// A single String S
// Constraints
// 1 < = length of String < = 1000
// Output Format
// The compressed String.
// Sample Input
// aaabbccds 
// Sample Output
// a3b2c2d1s1 
// Explanation
// In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' 
// is repeated twice 
// and 'd and 's' occurred only once.

import java.util.*;

public class compressString{
    public static String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int count =1;
        for(int i = 0;i<str.length();i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                compressed.append(str.charAt(i));
                compressed.append(count);
                count=1;
            }
        }
        return compressed.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compress(str));
    }
}