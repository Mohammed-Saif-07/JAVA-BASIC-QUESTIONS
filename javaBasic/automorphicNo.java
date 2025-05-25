package javaBasic;


import java.util.*;
public class automorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        int square = n * n;
        String str2 = String.valueOf(square);
        if(str2.endsWith(str)){
            System.out.println("yes");
        }else{
            System.out.println("n");
        }   
    }
}
