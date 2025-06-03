package placement;

import java.util.*;
public class printDuplicate {
    public static void main(String[] args) {
        int arr[] ={1,2,2,3,4,2,3}; // 1 2 2 3 4 
        Arrays.sort(arr);
        for(int i = 1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.print(arr[i]+" ");
                while(i<arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }
        }
    }
}
