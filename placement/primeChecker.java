// Write a program to Find prime and non-prime numbers in the array

// Sample Output

// Array = {3, 12, 21, 11}

// 3 - Prime
// 12 - Not Prime
// 21 - Not Prime
// 11 - Prime


package placement;

import java.util.*;
public class primeChecker {
    public static boolean isprime(int n ){
        if(n <=1){
            return false;
        }
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Arrays.toString(arr);
        for( int x : arr){
            if(isprime(x)){
                System.out.println(x + " - prime");
            }else{
                System.out.println(x + " - notPrime");
            }
        }
    }
   

}
