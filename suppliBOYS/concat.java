// : You are given provided with a string S and you have to take all even-indexed characters and 
// odd-indexed characters from a string and concatenates them together.
// Input Format
// The first line of the input contains the string S.
// Output format
// Print the string after merging.
// Constraints
// 1 <= S <=1000
// Time Limit
// 1 second
// Sample Input
// abcdefg
// Sample Output
// acegbdf

public class concat {
    public static void main(String[] args) {
        String str = "abcdefg";
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i%2==0){
                even.append(ch);
            }else{
                odd.append(ch);
            }
        }
        System.out.print(even.toString()+odd.toString());
    }
}
