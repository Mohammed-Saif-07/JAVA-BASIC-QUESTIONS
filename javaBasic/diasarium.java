// 135 = 1^1 + 3^2 + 5^3  = 1 + 9 + 125 => 135 itself

package javaBasic;

import java.util.Scanner;

public class diasarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp>0){
            temp /= 10;
            count++;
        }
        temp = n;
        double sum = 0;
        while ((temp>0)) {
            int remainder = temp % 10;
            sum = sum + Math.pow(remainder, count);
            temp /= 10;
            count--;
        }
        if(sum == n){
            System.out.println("diasarium number");
        }else{
            System.out.println("no");
        }
    }
}
