package Array;

import java.util.*;
public class missingNo {
    public static void main(String[] args) {
        int i;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of 1st array: ");
        int size = sc.nextInt();
        int arr1[] = new int[size - 1];
        System.out.print("enter elements of 1st array: ");
        for(i = 0; i < size - 1; i++){                // 1 2 3 _ 5 6
            arr1[i] = sc.nextInt();
        }
        int totalSum = (size*(size+1))/2;    //6 *((6-1))/2 = 21
        int actualSum = 0;
        for( i = 0; i < size - 1 ; i++){
            actualSum = actualSum + arr1[i]; //1 + 2 + 4 + 5 + 6 = 18
        }
        int missingNo = totalSum - actualSum; //21-18 = 3       
        System.out.println( "missingNo is :" + missingNo);
    }
}        