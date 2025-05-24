package Array;

import java.util.*;
public class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum elemnet in array is : " + max);
    }
}
    