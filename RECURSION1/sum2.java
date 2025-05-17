public class sum2 {
    public static void sumPrint(int i,int n,int sum){
        if(n==i){
            sum=sum + i;
            System.out.println(sum);
            return ;
        }
        sum =sum + i;
        sumPrint(i+1, n, sum);
        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        sumPrint(1, 5, 0);
    }
}
