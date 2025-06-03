package placement;

public class frequency2 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,5,4};
        int maxFrequency = 0;
        int mostFrequentElement = -1;
        int freq[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }       
        for(int i = 0;i<arr.length;i++){
            if (freq[i] > maxFrequency) {
                maxFrequency = freq[i];
                mostFrequentElement = i;
            }
        }
        System.out.println(mostFrequentElement + " occurs most i.e. : " + maxFrequency + " times");
    }
}
