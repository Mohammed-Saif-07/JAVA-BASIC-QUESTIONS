package Array;

import java.util.*;
public class commonElement {
    public static void main(String[] args) {
        int i;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of 1st array: ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.print("enter elements of 1st array: ");
        for(i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("enter size of 2nd array: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.print("enter elements of 2nd array: ");
        for(i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("common elements is: "); 
        for( i =0; i < size1 ; i++){
            for(int j = 0;j < size2 ;j++){
                if(arr1[i]== arr2[i]){
            System.out.println(arr1[i] + " ");
            break;
            }
        }
        
        }
        sc.close();
        
    }
}

