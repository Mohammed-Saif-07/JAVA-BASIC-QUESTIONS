// stack height = log(n)    x^n = 2^3 = 8

public class power2 {

    public static int calcPower(int x,int n){
    if(n==0){
        return 1; //base case 1
    }if(x == 0){
        return 0; //base case 2
    }
      if(n % 2 ==0){ //even
        return calcPower(x, n/2) * calcPower(x, n/2);
      }else{ //odd
        return calcPower(x, n/2) * calcPower(x, n/2) * x;
      }
    }
    public static void main(String[] args) {
        int x = 2,n=3;
        int ans = calcPower(x, n); 
        System.out.println(ans);
    }
}
