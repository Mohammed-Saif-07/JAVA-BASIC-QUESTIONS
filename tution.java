// KMP , MANACHER , Z - VALUE

/* 

import java.util.*;
public class tution
{
	public static void main(String[] args) {
		List<String> stuName = new ArrayList<>();
		List<Integer> rollNum = new ArrayList<>();
		int rollNo = 1001;
		Scanner sc = new Scanner(System.in);
		String Names = sc.nextLine();
		String[] names = Names.split(" ");
		for(String name : names  )
		{
		    stuName.add(name);
		    rollNum.add(rollNo); // 1001
		    rollNo++; // 1002
		    System.out.println(rollNo-1 + " "+ name);
		}
		String serach  =sc.nextLine();
		boolean isP = false;
		for(int i=0;i<stuName.size();i++)
		{
		    if(stuName.get(i).equals(serach))
		    {
		        isP = true;
		        break;
		    }
		}
		Collections.sort(stuName);
		for(int i=0;i<stuName.size();i++)
		{
		    System.out.println(stuName.get(i)+" "+ rollNum.get(i));
		    
		}
		if(isP)
		{
		    System.out.println("Given student, is present into list.");
		}
		else
		{
		    System.out.println("Given student, is not  present into list.");
		}
		
		
	}
}

*/

//---------------------------------

/* 
import java.util.*;

public class tution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter size");
        int a = sc.nextInt();
        int arr[] = new int[a];

        for( i=0; i<a; i++){
            arr[i] = sc.nextInt();
        
        }
        // int arr[] = {88, 4, 2, 8, 44};
        Arrays.sort(arr);

        for ( i = 0; i <a; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
}
*/

//---------------------ASCENDING ORDER----------------------------

/* 
import java.util.*;

public class tution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter size");
        int a = sc.nextInt();
        int arr[] = new int[a];

        for( i=0; i<a; i++){
            arr[i] = sc.nextInt();
        
        }
        // int arr[] = {88, 4, 2, 8, 44};
        Arrays.sort(arr);

        for ( i = 0; i >a; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
}

*/

//-------------------Descending order----------------------------

/* 
import java.util.*;

public class tution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("enter size");
        int a = sc.nextInt();
        int arr[] = new int[a];

        for( i=0; i<a; i++){
            arr[i] = sc.nextInt();
        
        }
        // int arr[] = {88, 4, 2, 8, 44};
        Arrays.sort(arr);

        for ( i = a-1; i >=0; i--) {
            System.out.print(arr[i] + " ");
            
        }
    }
}

*/
//--------------------ASCENDING ORDER--------------------
/* 
import java.util.*;
public class tution{
	public static void main(String[] args){
		int arr[] = {5,6,7,4,3,2,1};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}

	}
}
*/

//-------------------DESCENDING ORDER--------------------

/* 

import java.util.*;
public class tution{
	public static void main(String[] args){
		int arr[] = {5,6,7,4,3,2,1};
		Arrays.sort(arr);
		for(int i = arr.length -1; i >= 0; i--){
			System.out.println(arr[i] + " ");
		}

	}
}

*/


/*
 
 
import java.util.*;
public class tution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int maheshTime = sc.nextInt();
		int assistantTime = sc.nextInt();
		int totalSheet = sc.nextInt();

		int minTime = Math.min(maheshTime * totalSheet,(totalSheet + 1)/2*assistantTime);
			System.out.println(minTime);
		
	}
}

*/

//---------KMP using Brute force method-------------

/* 

import java.util.*;
public class tution{
	private static char[] j;

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
String Text = sc.nextLine();
String pattern = sc.nextLine();

for(int i = 0 ; i <= Text.length() - pattern.length(); i++){
		boolean isMatch = true;
		for(int j = 0 ; j < pattern.length();j++){
			if(Text.charAt(i+j) != pattern.charAt(j)){
				isMatch = false;
				break;
			}
		}
		if(isMatch){
			System.out.println(i);
		}
		}
	}
}

*/

//------------------------------------------------------------

// input-                
// 7					7								7 
// 7 3 1 4 7 0 6		7 3 1 4 7 0 6					7 3 1 4 7 0 6
// 3					2								1

// output-

// 7 3 1 4 0 6 7        7 3 1 0 4 7 6					1 3 7 4 7 0 6

//-----------------------------------------------------------

// Finding Triangles 
// input1 					input2
// 10						10
// 3 3 4 3 3 1 5 3 3 3     3 3 5 5 3 1 5 3 3 3

// output1					output2	
// 3 2						5 1

// JAVA program for implementation of KMP pattern
// searching algorithm

// class KMP_String_Matching {
// 	void KMPSearch(String pat, String txt)
// 	{
// 		int M = pat.length();
// 		int N = txt.length();

// 		// create lps[] that will hold the longest
// 		// prefix suffix values for pattern
// 		int lps[] = new int[M];
// 		int j = 0; // index for pat[]

// 		// Preprocess the pattern (calculate lps[]
// 		// array)
// 		computeLPSArray(pat, M, lps);

// 		int i = 0; // index for txt[]
// 		while ((N - i) >= (M - j)) {
// 			if (pat.charAt(j) == txt.charAt(i)) {
// 				j++;
// 				i++;
// 			}
// 			if (j == M) {
// 				System.out.println("Found pattern "
// 								+ "at index " + (i - j));
// 				j = lps[j - 1];
// 			}

// 			// mismatch after j matches
// 			else if (i < N
// 					&& pat.charAt(j) != txt.charAt(i)) {
// 				// Do not match lps[0..lps[j-1]] characters,
// 				// they will match anyway
// 				if (j != 0)
// 					j = lps[j - 1];
// 				else
// 					i = i + 1;
// 			}
// 		}
// 	}

// 	void computeLPSArray(String pat, int M, int lps[])
// 	{
// 		// length of the previous longest prefix suffix
// 		int len = 0;
// 		int i = 1;
// 		lps[0] = 0; // lps[0] is always 0

// 		// the loop calculates lps[i] for i = 1 to M-1
// 		while (i < M) {
// 			if (pat.charAt(i) == pat.charAt(len)) {
// 				len++;
// 				lps[i] = len;
// 				i++;
// 			}
// 			else // (pat[i] != pat[len])
// 			{
// 				// This is tricky. Consider the example.
// 				// AAACAAAA and i = 7. The idea is similar
// 				// to search step.
// 				if (len != 0) {
// 					len = lps[len - 1];

// 					// Also, note that we do not increment
// 					// i here
// 				}
// 				else // if (len == 0)
// 				{
// 					lps[i] = len;
// 					i++;
// 				}
// 			}
// 		}
// 	}

// 	// Driver code
// 	public static void main(String args[])
// 	{
// 		String txt = "ABABDABACDABABCABAB";
// 		String pat = "ABABCABAB";
// 		new KMP_String_Matching().KMPSearch(pat, txt);
// 	}
// }

/* 

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tution {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input
        int[] array = new int[size];

        // Read array elements from the user
        System.out.print("Enter the array elements separated by spaces: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create a list of indices and sort them based on the array values in descending order
        Integer[] indices = new Integer[size];
        for (int i = 0; i < size; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Collections.reverseOrder((i, j) -> Integer.compare(array[i], array[j])));

        // Print the sorted indices
        System.out.println("Sorted indices in descending order:");
        for (int index : indices) {
            System.out.print(index + " ");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

*/

//ISOMORPHIC KEYBOARD LAYOUT
//imput1      input2
//egg		  aab
//add		  abb

//output1	  output2
//yes		  no	

/* 

PRIME FACTORISATION


import java.util.*;
public class tution {
    public static void main(String[] args) {
        int number = 56;
        List<Integer> primeFactors = primeFactorization(number);
        System.out.println(primeFactors);
    }
    private static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}

*/

//-------------------------PRIME FACTORISATION OF 2 NOS------------------

/* 

import java.util.*;

public class tution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max =Math.max(a, b);
		int min =Math.min(a, b);

		int lcm = max;

		while(true){
			if(lcm % max == 0 && lcm % min == 0){
				break;
			}
			lcm = lcm + max;
		}
			System.out.println(lcm);
	}
	
}

*/

//------------------GCD------------------------

/* 

import java.util.*;
public class tution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int GCD = 0;
		for(int i = 1 ; i <= a && i <= b ; i++){
			if(a%i ==0 && b%i==0){
				GCD = i;
			}
		}
		System.out.println(GCD);
	}
}

*/

//--------------- DISTRUBTION IN CIRCLE MNP------------------------

/* 

import java.util.*;
public class tution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();
		int res =(p + m - 1)%n;
		if(res == 0){
			System.out.println(n);
		}
		System.out.println(res);
	}
}

*/

//-----------------------MIN-MAX------------------------------------

/* 

import java.util.*;
public class tution{
	public static void main(String[] args) {
		int arr[] = {7,3,2,11,4,9,1};
		int m = 3;
		if(arr.length < 3){
			System.out.println("-1");
		}
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		for(int i = 0; i <= arr.length-m; i++){
			int Diff = arr[i + m - 1] - arr[i];
			minDiff = Math.min(minDiff, Diff);
		}
		
		System.out.println(minDiff);
		}
		
	}

*/

//---------------------SORTING---------------------

/* 

import java.util.*;

public class tution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        // Input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array in ascending order
        System.out.print("ASCENDING ORDER: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print the sorted array in descending order
        System.out.print("\nDESCENDING ORDER: ");
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

*/

//----------------------LINEAR SEARCH---------------------------

/* 

import java.util.*;

public class tution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        // Input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
		Arrays.sort(arr);
		int target = sc.nextInt();
		int res = Arrays.binarySearch(arr, target);
		System.out.println(res);
	}
}	
	
*/

//---------------IMP QUESTION----------------

/* 

import java.util.*;
public class tution
{
	public static void main(String[] args) {
		List<String> stuName = new ArrayList<>();
		List<Integer> rollNum = new ArrayList<>();
		int rollNo = 1001;
		Scanner sc = new Scanner(System.in);
		String Names = sc.nextLine();
		String[] names = Names.split(" ");
		for(String name : names  )
		{
		    stuName.add(name);
		    rollNum.add(rollNo); // 1001
		    rollNo++; // 1002
		    System.out.println(rollNo-1 + " "+ name);
		}
		String serach  =sc.nextLine();
		boolean isP = false;
		for(int i=0;i<stuName.size();i++)
		{
		    if(stuName.get(i).equals(serach))
		    {
		        isP = true;
		        break;
		    }
		}
		Collections.sort(stuName);
		for(int i=0;i<stuName.size();i++)
		{
		    System.out.println(stuName.get(i)+" "+ rollNum.get(i));
		    
		}
		if(isP)
		{
		    System.out.println("Given student, is present into list.");
		}
		else
		{
		    System.out.println("Given student, is not  present into list.");
		}
		
		
	}
}

*/

//------------------------------------------------------------

// input-                
// 7					7								7 
// 7 3 1 4 7 0 6		7 3 1 4 7 0 6					7 3 1 4 7 0 6
// 3					2								1

// output-

// 7 3 1 4 0 6 7        7 3 1 0 4 7 6					1 3 7 4 7 0 6

/*
 
 
import java.util.*;
public class tution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        if(k==3)
        {
            Arrays.sort(arr,n-3,n);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        if(k==1)
        {
            Arrays.sort(arr,0,3);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
       
        if(k==2)
        {
            Arrays.sort(arr,n/2-1,n/2+2);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

*/

//------------MOTOGP-------------

/* 

import java.util.*;
public class tution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int mindiff= arr[1]-arr[0];
		for(int i=1;i<n;i++)
		{
		    mindiff = Math.min(mindiff,arr[i]-arr[i-1]);
		}
		System.out.println(mindiff);
	}
}

*/

//----------MANANJAY STICKS------------

/* 

import java.util.*;
public class tution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]==k)
		    {
		        count++;
		    }
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[i]+arr[j]==k)
		        {
		            count++;
		        }
		    }
		    
		}
		System.out.println(count);
	}
}

*/

//----------SWAP BOOKS-----------------

/* 

import java.util.*;
public class tution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
		   
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[i]>arr[j])
		        {
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j]= temp;
		            count++;
		        }
		    }
		    
		}
		System.out.println(count);
	}
}

*/

//-------------HARMAN----------------

/* 

import java.util.*;
public class tution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k)
            {
                int p=arr[i];
                System.out.print(p+" "+i);
                break;
            }
            if(arr[i]!=k)
            {
                System.out.print(-1);
                break;
            }
        }
    }
}

*/

//----------------FEW TOPPERS------------------------

/* 

import java.util.*;
public class tution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=arr[n-k])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }
}

*/

//---------------TRIANGLE-------------------------

/*

import java.util.*;

public class tution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nS = sc.nextInt();
        int[] arr = new int[nS];
        for (int i = 0; i < nS; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxSide = 0;
        int triangleCount = 0;
        int count = 1;
        for (int i = 1; i < nS; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count >= 3 && arr[i - 1] > maxSide) {
                    maxSide = arr[i - 1];
                    triangleCount = count / 3;
                }
                count = 1;
            }
        }
        if (count >= 3 && arr[nS - 1] > maxSide) {
            maxSide = arr[nS - 1];
            triangleCount = count / 3;
        }
        System.out.println(maxSide + " " + triangleCount);
    }
}

*/


//-------------------PRINT INDICES--------------------------

import java.util.*;
	public class tution{
		private static char[] j;
	
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
	String Text = sc.nextLine();
	String pattern = sc.nextLine();
	
	for(int i = 0 ; i <= Text.length() - pattern.length(); i++){
			boolean isMatch = true;
			for(int j = 0 ; j < pattern.length();j++){
				if(Text.charAt(i+j) != pattern.charAt(j)){
					isMatch = false;
					break;
				}
			}
			if(isMatch){
				System.out.println(i);
			}
			}
		}
	}