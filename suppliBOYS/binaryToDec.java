public class binaryToDec {
    public static long check(long n){
        int i = 0;
        int decimal = 0;
        while(n!=0){
            long rem = n % 10;
            decimal += rem * Math.pow(2, i);
            n/=10;
            ++i;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n = 111;
        System.out.println(check(n));
    }
}
