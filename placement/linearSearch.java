package placement;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int arr[] = new int[a];

        
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
		Arrays.sort(arr);
		int target = sc.nextInt();
		int res = Arrays.binarySearch(arr, target);
		System.out.println(res);
	}
}	