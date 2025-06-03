package placement;

import java.util.*;
public class checkSquare{
    public static void check(int arr[]){
        for(int i = 0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i]; 
        }
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-3,-2,4,5};
        check(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}