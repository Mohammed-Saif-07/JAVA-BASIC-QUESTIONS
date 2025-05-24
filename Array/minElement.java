package Array;

import java.util.*;
public class minElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("minimum elemnet in array is : " + min);
    }
}