package Array;

import java.util.*;

public class sumEven {
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
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
            
        }
        System.out.println("sum of even no is: " + sum);
    }
}