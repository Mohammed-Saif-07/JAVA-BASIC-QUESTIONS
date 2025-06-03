package placement;

// Q.3. Identifying Longest Substring without Repeating Characters for Language Learning Platform
// Imagine you're developing a text processing tool for a language learning platform. Your task is to create a program that analyzes input text to find the longest substring without repeating characters, helping language learners identify continuous sequences of unique characters within sentences.

// Input Explanation:
// The input consists of a single line containing a string of characters.

// Output Explanation:
// The output consists of a single integer representing the length of the longest substring without repeating characters in the input string.

// Sample Input 1: 
// ABCDEFABCIHJKLABCD
// Sample Output 1:
// 11

// Sample Input 2: 
// 1234567890
// Sample Output 2: 
// 10

public class longestSub {
    public static int findLenght(String str){
        int maxLength = 0;
        String currSub = "";
        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            int index = currSub.indexOf(currChar);

            if( index != -1){
                currSub = currSub.substring(index+1);
            }
            currSub += currChar;
            maxLength = Math.max(maxLength, currSub.length());
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(findLenght(str));
    }
}
