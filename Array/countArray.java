package Array;

import java.util.*;
public class countArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter elements : ");

        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else  {
                oddCount++;
            }
        }

        System.out.println("Zeros are : " + zeroCount);
        System.out.println("Positive Numbers are : " + positiveCount);
        System.out.println("Negative Numbers are : " + negativeCount);
        System.out.println("Even Numbers are : " + evenCount);
        System.out.println("Odd Numbers are : " + oddCount);

    }
}
