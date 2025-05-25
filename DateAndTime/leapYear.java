// package DateAndTime;



import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start yera");
        int n = sc.nextInt();
        System.out.println("enter end year");
        int m = sc.nextInt();
        // boolean leapCheck = false;
        if(m>n){
        for(int i = n;i<=m;i++){
            if((i%4==0 && i%100 !=0) || i%400==0){
                System.out.println(i + " = 366");
            }else{
                System.out.println(i + " = 365");
            }
            }
        }else{
                System.out.println("end year must be greater");
            }
    }
}
