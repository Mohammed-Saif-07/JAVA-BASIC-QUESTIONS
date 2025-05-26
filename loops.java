/*

public class loops {
    public static void main(String[] args){
        for(int counter = 0; counter < 3; counter = counter +1){
            System.out.println("hello");
        }
    }
}

*/

/*Q - Print the no from 1-10 

public class loops{
    public static void main(String[] args){
        // counter++ means => counter = counter + 1
        for(int counter = 1;counter < 11;counter++){
            System.out.println(counter);
        }
    }
}
*/

//-------------WHILE LOOP----------------

/*

public class loops{
    public static void main(String[] args){
        // counter++ means => counter = counter + 1 counter can be written as i
        int i = 1;
        while(i<11){
            System.out.println(i);
            i++; // i++ means => i = i + 1;
        }
    }
}

*/

//----------DO-WHILE---------------------------
/*

public class loops{
    public static void main(String[] args){
        // counter++ means => counter = counter + 1 counter can be written as i
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i<11);
    }
}

*/

//----------------- Q - Print the sum of first n natural no------------ 
//------------take input from user----------------

/*

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

*/

//-----------Print table of a no input from user-------------------

/*

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<11 ; i++){
            System.out.println(n*i);
        }
        
    }
}

*/

//------------------Print all even numbers till n-------------------

/*

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        
        System.out.println("Even no from 1 to" + n + " :");
        for(int i=1 ; i<=n ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
        
}   

*/

// Q-   Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//      If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//      If they enter 0 then stop.
//      If he/ she scores :
//      Marks >=90 -> print “This is Good”
//      89 >= Marks >= 60 -> print “This is also Good”
//      59 >= Marks >= 0 -> print “This is Good as well”
// 	    Because marks don’t matter but our effort does.
//      (Hint : use do-while loop but think & understand why)

/*

import java.util.Scanner;

public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;

        do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is good");
            }else if (marks >= 60 && marks <= 89){
                System.out.println("This is also good");
            }else if (marks >= 0  && marks <= 59){
                System.out.println("This is good as well");
            }
            System.out.println("Want to continue? Press 1 to continue 0 to stop");
            i = sc.nextInt();
        }while(i==1);

    }
}

*/

//-----------------Print if a number n is prime or not (Input n from the user)----------------

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n == 1) {
                System.out.println("Neither prime nor composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("Not a prime number");
        }
    }
}
