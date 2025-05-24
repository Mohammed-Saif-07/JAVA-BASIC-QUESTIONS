package Array;

import java.util.*;
public class reverseArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            System.out.print("original array: ");
            System.out.print(arr[i] + " ");
        }  
        System.out.print("reverse arrray: ");
        for( int i = arr.length - 1 ; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
