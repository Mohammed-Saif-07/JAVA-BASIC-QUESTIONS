// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at 
// least one space. Print a string of the words in reverse order concatenated by a single space.
// Please note that the input string s may contain leading or trailing spaces, or multiple spaces 
// between two words. However, the output string should only have a single space separating the 
// words, without any extra spaces.
// Input format:
// Accept a string
// Output format:
// Print the string of the words in reverse order
// Sample Input 1:
// Chitkara is best
// Sample Output 1:
// best is Chitkara

public class reverseSentence {
    public static void main(String[] args) {
        String str = "Chitkara is lawda";
        String sub[] = str.split(" ");
        for(int i =sub.length-1;i>=0;i--){
            System.out.print(sub[i]+" ");
        }
    }
}
