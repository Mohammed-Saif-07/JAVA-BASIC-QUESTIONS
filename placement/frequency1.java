package placement;

public class frequency1 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,5,4};
        int freq[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }       
        for(int i = 0;i<arr.length;i++){
            if (freq[i] > 0) {
                System.out.println(i + " occurs most i.e. : " + freq[i] + " times");
            }
        }
        
    }
}
