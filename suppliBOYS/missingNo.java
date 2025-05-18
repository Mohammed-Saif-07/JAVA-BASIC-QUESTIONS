// Write a program to find a missing number in an array

// Sample Output

// Array = {1, 2, 4, 5, 6, 7}

// Missing Array Number = 3

public class missingNo {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,6};
        int n = arr.length+1;
        int tot = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(tot-sum);
    }
}
