// stack height = n    x^n = 2^3 = 8

public class power1 {

    public static int calcPower(int x,int n){
    if(n==0){
        return 1; //base case 1
    }if(x == 0){
        return 0; //base case 2
    }
        int xPowerNM1 = calcPower(x, n-1);
        int xPowern = x * xPowerNM1;
        return xPowern;
    }
    public static void main(String[] args) {
        int x = 2,n=3;
        int ans = calcPower(x, n); 
        System.out.println(ans);
    }
}
