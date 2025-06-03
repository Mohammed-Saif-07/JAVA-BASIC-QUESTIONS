// Write a program to find a missing number in an array

// Sample Output

// Array = {1, 2, 4, 5, 6, 7}

// Missing Array Number = 3


package placement;


public class missNo {
    public static int miss(int arr[]){
        int n = arr.length+1;
        int tot = (n*(n+1))/2;
        int act = 0;
        for(int i = 0;i<arr.length;i++){
            act+=arr[i];
        }
        return tot - act;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int missingNumber = miss(arr);
        System.out.println(missingNumber);
    }
}
