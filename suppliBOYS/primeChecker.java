public class primeChecker {
    public static boolean check(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
        for(int x : arr){
            if(check(x)){
                System.out.println(x+" yes");
            }else{
                System.out.println(x+" no");
            }
        }
    }
}
