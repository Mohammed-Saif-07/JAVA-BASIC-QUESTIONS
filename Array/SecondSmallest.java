package Array;

import java.util.*;
public class SecondSmallest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size : ");
    int size = sc.nextInt();
    if( size < 2){
        System.out.println("! array size should be atleast 2");
    }
    int arr[]= new int[size];
    System.out.print("enter elements : ");
    for(int i = 0; i < size; i++){
        arr[i] = sc.nextInt();
    }

    int temp;
    for(int i = 0;i < size;i++){
        for(int j = i+1; j < size;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                temp = arr[j];
            }
        }
    }
    if(arr[1]==arr[0]){
        System.out.println("all elements are same");
    }else{
        System.out.print("second smallest no is: " + arr[1]);
    }

    }
}
