package placement;

public class equlibrium {
    public static int findIndex(int arr[]){
        int n =arr.length;
        int totalSum = 0;
        int leftSum = 0;
        for(int num : arr){
            totalSum += num;
        }
        for(int i = 0;i<n;i++){
            totalSum -= arr[i];
            if(leftSum == totalSum){
                return i;
            } 
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-7,1,5,2,-4,3,0};
        int index = findIndex(arr);
       if(index != -1){
        System.out.println(index);
       }else{
        System.out.println("no");
       }
    }
}
