package Array;

import java.util.*;
public class linearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements : ");
        for(int i = 0;i < size; i++){
            arr[i]= sc.nextInt();

        }
         System.out.print("enter target element: ");
            int targetElement =sc.nextInt();

            int index = -1;
            for(int i = 0 ; i < size; i++){
                if(arr[i] == targetElement){
                    index = i;
                    break;
                }
            }
            if(index != -1){
                System.out.println("element found at index : " + index);
            }
            else{
                System.out.println("element not found");
            }
        }
    }
