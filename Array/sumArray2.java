package Array;

import java.util.*;

public class sumArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        int sum = 0;
        int product = 1;
        
        

        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            
            sum = sum + arr[i];
            product = product * arr[i];
            
        }
        
        System.out.println("sum" + sum);   
        System.out.println("product" + product);
      
        
    }
}