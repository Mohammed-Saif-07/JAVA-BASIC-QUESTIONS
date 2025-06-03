package placement;


import java.util.Arrays;
public class noSortIndex
{
	public static void main(String[] args) {
int arr[] = {7,1,6,2,5,4,3}; // 1 6 7 2 3 4 5
int k = 3;
int arr1[] = new int[k];
int x1[] = new int[arr.length];
int x2[] = new int[arr.length];
int temp = arr[k];

for(int i = 0;i<k;i++){
    arr1[i]=arr[i];
}
Arrays.sort(arr1);

for(int i = k+1;i<arr.length;i++){
    x1[i] =  arr[i];
	}
	Arrays.sort(x1);

	for(int i = k+1;i<arr.length;i++){
	}

	for(int i = 0;i<k;i++){
	    x2[i]=arr1[i];
	}
	x2[k]=temp;

for( int i = k+1;i<x2.length;i++){
    x2[i]=x1[i];
   }

	for(int ele:x2){
	    System.out.print(ele+" ");
	}
}
}

