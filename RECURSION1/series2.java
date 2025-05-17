public class series2 {

    public static void printNo(int n){
        if(n == 6){
            return;
        }
        System.out.print(n + " ");
        printNo(n+1);
    }
    public static void main(String[] args) {
        int n =1;
        printNo(n);
    }
}

