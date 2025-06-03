package placement;
import java.util.Scanner;
public class windowsum {
    public static int check(int arr[] , int k){
        int windowsum = 0;
        int max = 0;
        for(int i = 0;i<k;i++){
            windowsum += arr[i];
        }
         max = windowsum;
        for(int i = k;i<arr.length;i++){
            windowsum += arr[i] - arr[i-k];//
            max = Math.max(max, windowsum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        
        System.out.println(check(arr, k));
    }
}
