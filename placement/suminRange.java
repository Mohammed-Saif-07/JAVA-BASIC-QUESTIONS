package placement;

public class suminRange {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; 
        int l = 1;
        int r = 3;
        int arr2[] = new int[arr.length];
        for( int i = 1;i<arr.length;i++){
            arr2[i] = arr2[i-1] + arr[i];
        }
        if(l==0){
            System.out.println(arr2[r]);
        }else{
            System.out.println(arr2[r]-arr2[l-1]); 
        }
    }
}
