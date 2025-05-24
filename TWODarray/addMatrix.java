import java.util.*;
public class addMatrix
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int matrix1[][]=new int[rows][columns];
		int matrix2[][]=new int[rows][columns];
		int res[][] = new int[rows][columns];
		
		for(int i=0;i<rows;i++){
		    for(int j=0;j<columns;j++){
		       matrix1[i][j]=sc.nextInt();
		       
		    }
		}
		for(int i=0;i<rows;i++){
		    for(int j=0;j<columns;j++){
		      
		       matrix2[i][j]=sc.nextInt();
		    }
		}
		
		 System.out.println("matrix 1. ");
		for(int i=0;i<rows;i++){
		    for(int j=0;j<columns;j++){
		     
		       System.out.print(matrix1[i][j]+"\t");
		       
		    }
		    System.out.println();
		}
		 System.out.println("matrix 2 is. ");
		for(int i=0;i<rows;i++){
		    for(int j=0;j<columns;j++){
		     
		      
		       System.out.print(matrix2[i][j]+"\t");
		    }
		    System.out.println();
		}
		
		System.out.println("sum matrix  is. ");
			for(int i=0;i<rows;i++){
		        for(int j=0;j<columns;j++){
		             res[i][j]=matrix1[i][j]+ matrix2[i][j];
		             System.out.print(res[i][j]+"\t");
	
		    }
		     System.out.println();
	}

}
}