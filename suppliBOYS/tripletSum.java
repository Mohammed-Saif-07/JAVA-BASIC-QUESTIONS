// Given an array A of N integers. Check whether it contains a triplet that sums up to zero.
// Input Format
// The first line contains an integer N denoting the size of the array. The second line contains 
// elements of the array A.
// Output format
// Print 1 if it contains a triplet that sums up to zero else print 0.
// Constraints
// 1 <= N <= 10^4
// -10^6 <= A[i] <= 10^6
// Example
// DO NOT WRITE ANYTHING ON QUESTION PAPER EXCEPT ROLL NO.
// 8 CA109/2022-2023
// Sample Input
// 5
// 0 -1 2 -3 1
// Sample Output
// 1


public class tripletSum {
    public static void main(String[] args) {
        int arr[] = {-34, -15, 11, 78, -7, 2, -16, -86, -53, -56, -17, -12, -80, 99, -93, -63, 41, 2, 90, 33, -59, -99, -36, -76, 29, 66, -80, 100, 65, -43, 29, -29, 31, 94, -84, -99, 97, -17, -28, 91, 2, 98, -46, 57, 25, 15, -86, 86, 31, -22, -80, 18, 70, -76, -5, 78, -72, 64, -83, -59, -17, 100, -52, 18, 26, -97, -31, -91, 2, -50, 9, -79, 91, -14, 36, 36, 46, 7, 17, -56, 85, -46, -62, 65, -65, 5, -34, -45, -100, -26, -34, 34, 90, 55, 46, -91, 80, 76, -100, -77};
        int n = arr.length;
        boolean flag = false;
        int sum = 0;
        for(int i = 0;i<n-2;i++){
            int left = i +1;
            int right = n -1;
            if(arr[i]+arr[left]+arr[right]==sum){
                if(sum==0){
                    flag = true;
                    System.out.println(1);
                    break;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            if(flag){
                break;
            }
        }
        if(!flag){
            System.out.println(0);
        }
    }
}
