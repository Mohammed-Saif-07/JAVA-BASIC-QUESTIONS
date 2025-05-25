package javaBasic;

import java.util.Scanner;

public class armNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int original;
        // int remainder;
        int result  = 0;
        original = n;
        while(original != 0){
            int remainder = original % 10;
            result += Math.pow(remainder,len);
            original /= 10;
        }
        if(result == n){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
    }
}
