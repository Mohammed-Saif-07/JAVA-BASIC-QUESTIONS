// Q1. A finance company wants to calculate the total sales and the accountant needs to calculate the 
// exact amount of the total sales and he has been instructed to roundoff the obtained total to nearest 
// multiple of 10. So write a JAVA program to help the accountant to round the given number to 
// nearest multiple of 10
// Input Format
// Input consists of a positive integer value.
// Output Format
// Output consists of positive integer value which is rounded to the nearest whole number having 
// zero as last.
// Sample Input 1
// 4722
// Sample Output 1
// 4720
// Sample Input 2
// 10
// Sample Output 2
// 10

public class roundOff {
    public static void main(String[] args) {
        int n = 4722;
        int a = (n/10) * 10;
        int b = a + 10;
        if(n-a>b-n){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
