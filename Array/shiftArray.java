package Array;

import java.util.*;
public class shiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();  
        }
        int count = 0;
        for (int i =0;i< size;i++){
            if(arr[i] != 0){
                arr[count++]=arr[i];
            }
        }
          while(count<size){
            arr[count++]=0;
          }
          for(int i = 0;i < size;i++){
            System.out.print(arr[i] + " ");
        } 
    }
 }


