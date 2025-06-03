package placement;

public class targetSum2 {
    static int[] pairSum(int arr[], int n, int target) {
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == arr[i] + arr[j]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans; 
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,11,15};
        int target = 12;
        int result[] = pairSum(nums, nums.length, target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("{" + nums[result[0]] + "," + nums[result[1]] + "}");
        } else{
            System.out.println("{-1,-1}");
        }
    }
}
