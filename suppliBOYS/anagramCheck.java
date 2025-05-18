// Anagram is a word or phrase made by transposing the letters of another word or phrase
// The word "secure" is an anagram of "rescue."
// Write a program that takes two strings as input and checks if they are anagrams of each other. The program 
// should handle exceptions that may occur during input or processing

import java.util.*;

public class anagramCheck {
    public static String check(String str1 , String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            return "Yes " + str1 + " " + str2 + " are anagram";
        }else{
            return "No " + str1 + " " + str2 + " are not anagram";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(check(str1, str2));
    }
}
