/*

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>18) {
            System.out.println("adult");
        } else {
        System.out.println("minor");
    }
}
}

*/

//-------------------------CHECK IF NO IS ODD--------------------------------------


/*

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
        System.out.println("odd");
    }
}
}

*/

//----------------------- USE OF ELSE IF -----------------------------------

/*

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == y) {
            System.out.println("x is equal to y");
        } 
           else if (x > y){
                System.out.println("x is greater than y");
            } else {
            System.out.println("x is lesser than y");
        }
          
       
    }
}

*/

//--------- SWITCH STATEMENTS ----------------------------

/*

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("HELLO");
        }else if(button ==2){
            System.out.println("NAMASTE");
        }else if(button ==3){
            System.out.println("BONJOUR");
        }else {
            System.out.println("INVALID BURRON");
        }

    }
} 

*/

//----------------- SWITCH CASE-BREAK STATEMENTS--------------------

/*

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("NAMASTE");
            break;
            case 2 : System.out.println("HELLO");
            break;
            case 3 : System.out.println("BONJOUR");
            break;
            default : System.out.println("INVALID BUTTON");
        }

    }
}

*/

//--------------- QUESTIONS----------------------

/*  Q- Ask the user to enter the number of the month 
    & print the name of the month. 
    For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on. 
*/

/* 
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("JAN");
            break;
            case 2 : System.out.println("FEB");
            break;
            case 3 : System.out.println("MAR");
            break;
            case 4 : System.out.println("APR");
            break;
            case 5 : System.out.println("MAY");
            break;
            case 6 : System.out.println("JUN");
            break;
            case 7 : System.out.println("JUL");
            break;
            case 8 : System.out.println("AUG");
            break;
            case 9 : System.out.println("SEP");
            break;
            case 10 : System.out.println("OCT");
            break;12
            case 11 : System.out.println("NOV");
            break;
            case 12 : System.out.println("DEC");
            break;
            default : System.out.println("INVALID MONTH");
        }

    }
}

*/

/*
 Q- Make a Calculator. Take 2 numbers (a & b) from the user 
    and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

*/
import java.util.Scanner;

public class conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number(a) : ");
        double a = sc.nextDouble();

        System.out.println("Enter the number(b) : ");
        double b = sc.nextDouble();

        System.out.println("Select the operation you want to perform: ");
        System.out.println("1 : + (ADDITION)");
        System.out.println("2 : - (SUBSTRACTION)");
        System.out.println("3 : * (MULTIPLICATION)");
        System.out.println("4 : / (DIVISION)");
        System.out.println("5 : % (REMAINDER"); 

        int operation = sc.nextInt();
        double result=0.0;


        switch (operation){
            case 1:
            result = a + b;
            break;
            case 2:
            result = a - b;
            break;
            case 3:
            result = a * b;
            break;
            case 4: if(b!=0){
            result = a / b ;
                } else{
            System.out.println("NOT DEFINED");
            return;
             }
            break;
            case 5: if(b!=0){
            result = a % b ;
                } else{
            System.out.println("NOT DEFINED");
            return;
             }
            break;
            default :
            System.out.println("INVAID OPERATION");
            return;
        }
        System.out.println("Result : " + result);
    }
}