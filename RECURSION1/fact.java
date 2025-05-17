public class fact {
    public static int calcFact(int n){
        if(n ==1 || n == 0){
            return 1;
        }
        else{
            return n*calcFact(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcFact(n));
        
    }
}

// 5* (5-1) |
// 4* (4-1) | => 5*4*3*2*1 = 120
// 3* (3-1) | 
// 2* (2-1) |
// 1 => return 1

