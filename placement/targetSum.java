package placement;

import java.util.Arrays;

public class targetSum {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,6};
        int k = 11;
        boolean flag = false;
        // Arrays.toString(arr);
        for( int i = 0;i<arr.length-1;i++){
            for( int j = i + 1;j<arr.length;j++){  
                if(arr[i] + arr[j] == k){
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");
                    flag = true;
                    break;
                }
            }  
        }
        if(!flag){
            System.out.println("{-1,-1}");
        } 
    }
}
