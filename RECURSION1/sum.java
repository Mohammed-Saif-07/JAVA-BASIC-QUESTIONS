import java.util.*;

public class sum {
    public static int sumPrint(int n){
        if(n == 0){
            return 0;
        }else{        
            return sumPrint(n-1)+n; // n=5; 4+3+2+1+5 = 15
        }    
    }
        public static void main(String[] args){
            Scanner sc=  new Scanner(System.in);
            System.out.print("enter no : ");
            int n = sc.nextInt();
            System.out.println("Sum of first " + n + " no is : " + sumPrint(n));
            sc.close();
        }
    }

