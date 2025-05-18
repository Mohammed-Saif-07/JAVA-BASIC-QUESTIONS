// 1. Given a string S, find length of the longest substring with all distinct characters. 
// Input format:
// Input will consist of string.
// Output format:
// The output will be a single integer denoting the length of the longest substring.
// Sample Input:
// Chitkara
// Sample Output:
// 7
// Sample Input:
// acfagg
// Sample Output:
// 4 

public class distinctCharacterCount {
    public static void main(String[] args) {
        String str = "acfagg";
        int n = str.length();
        if(n==0){
            System.out.println(0);
        }
        int maxL = 0;
        for(int i =0;i<n-1;i++){
            boolean[] visited = new boolean[128];
            visited[str.charAt(i)]=true;
            for(int j = i + 1;j<n;j++){
                if(visited[str.charAt(j)]){
                    break;
                }
                visited[str.charAt(j)]=true;
                maxL = Math.max(maxL, j-i+1);
            }
        }
        System.out.println(maxL);
    }
}
