// Write a Java program to reverse each word of a string individually.
// Input Format :
// String S
// Output Format :
// Modified reversed string
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Chitkara
// Sample Output 1:
// emocleW ot araktihC

public class reverseEverything {
    public static void main(String[] args) {
        String str = "Welcome to Chitkara";
        String words[] = str.split(" ");
        for(String word:words){
            for(int i = word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
