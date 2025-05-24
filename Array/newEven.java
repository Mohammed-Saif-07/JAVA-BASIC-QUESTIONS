package Array;

import java.util.*;
class newEven{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the first array limit : ");
        int n=sc.nextInt();
        System.out.print("enter the second array limit : ");
        int m=sc.nextInt();
        int [] arr1=new int[n];
         int [] arr2=new int[m];
         int [] arr3=new int[100];
         int k=0;
         System.out.println("enter elements of 1st array: ");
         for(int i=0;i<n;i++){
             arr1[i]=sc.nextInt();
         }
         System.out.println("enter elements of 2nd array: ");
        for(int i=0;i<m;i++){
             arr2[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){
             if(arr1[i]%2==0){
                 arr3[k]=arr1[i];   // STORING THE VALUE OD arr1[i] 
                 k++;               // IN arr3[k]
             }
         }
        for(int i=0;i<m;i++){
             if(arr2[i]%2==0){
                 arr3[k]=arr2[i];   // STORING THE VALUE OD arr2[i] 
                 k++;               // IN arr3[k]
             }
         }
         System.out.print("even elements in 1st and 2nd array are : ");
         for(int i=0;i<k;i++){
             System.out.print(arr3[i] + " ");
         }
        
    }
}