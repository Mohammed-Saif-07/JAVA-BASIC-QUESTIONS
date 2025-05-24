package Array;

import java.util.*;
public class oddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            //System.out.println("odd elements in array");
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
            
        }
        
    }
}


