package Array;

import java.util.*;
import java.util.Arrays;
public class Largest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size : ");
    int size = sc.nextInt();
    int arr[]= new int[size];
    System.out.print("enter elements : ");
    for(int i = 0; i < size; i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int n = arr.length;
    System.out.println("largest element is : " + arr[n-1]);

    }
}