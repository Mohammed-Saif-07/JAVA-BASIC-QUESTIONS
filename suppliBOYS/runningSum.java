public class runningSum {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        for(int i = 0;i<arr.length;i++){
            if(i>0){
                arr[i]+=arr[i-1];
            }
            System.out.print(arr[i]+" ");
        }
        
    }
}
