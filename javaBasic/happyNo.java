package javaBasic;

import java.util.Scanner;

public class happyNo {
    static int sumDigitSquare(int n){
        int sq = 0;
        while( n != 0){
            int digit = n % 10;
            sq += digit*digit;
            n = n/10;
        }
        return sq;
    }
    static boolean isHappy(int n){
        while(true){
            if(n == 1)
                return true;
            n = sumDigitSquare(n);
            if( n == 4){
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isHappy(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
