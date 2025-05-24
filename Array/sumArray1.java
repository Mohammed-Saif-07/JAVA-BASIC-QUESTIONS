package Array;

import java.util.*;

public class sumArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        int sum = 0;
        
        

        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            
            sum = sum + arr[i];
            // double average = sum/a;
            //   System.out.print(average + " ");
        }
        
        System.out.print(sum);   
      
        
    }
}