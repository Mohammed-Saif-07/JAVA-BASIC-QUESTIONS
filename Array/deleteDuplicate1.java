package Array;

import java.util.*;

public class deleteDuplicate1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array : ");
		int n=sc.nextInt();
		int [] array=new int[n];
		System.out.print("enter the elements : ");
		for(int i=0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		int size=array.length;
		if(size==0 || size==1){
		    System.out.println("array is without duplicates");
		}
		int j=0;
		for(int i=0;i<size-1;i++){
		    if(array[i]!=array[i+1]){
		        array[j++]=array[i];
		    }
		}
		array[j++]=array[size-1];
		System.out.print("array without duplicates is : ");
		for(int i=0;i<j;i++){
		    System.out.print(array[i] + " ");
		}
		}
}