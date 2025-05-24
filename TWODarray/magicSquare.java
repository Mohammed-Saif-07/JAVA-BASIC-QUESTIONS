import java.util.*;
public class magicSquare
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of matrix");
	    int n=sc.nextInt();
	    int [][] matrix=new int[n][n];
	    System.out.println("enter the elements");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            matrix[i][j]=sc.nextInt();
	        }
	    }
	    int sumrow=0;
        int sumcol=0;
	    for(int i=0;i<n;i++){
	        sumrow=sumrow+matrix[0][i];
	        sumcol=sumcol+matrix[i][0];
	    }
	    if(sumrow!=sumcol){
	        System.out.println("not a magic square");
	        return;
	    }
	    int sumdiag1=0;
        int sumdiag2=0;
	    for(int i=0;i<n;i++){
	        sumdiag1=sumdiag1+matrix[i][i];
	        sumdiag2=sumdiag2+matrix[i][n-1-i];
	    }
	    if(sumdiag1!=sumdiag2 || sumdiag1!=sumrow){
	        System.out.println("not a magic sq");
	        return;
	    }
	    for(int i=1;i<n;i++){
	        int rowSum=0;
            int colSum=0;
	        for(int j=0;j<n;j++){
	            rowSum=rowSum+matrix[i][j];
	            colSum=colSum+matrix[i][j];
	        }
	        if(rowSum!=sumrow || colSum!=sumcol){
	            System.out.println("not a magic sq");
	            return;
	        }
	    }
	    System.out.println("Magic sq");
		
	}
}

// 8 1 6
// 3 5 7
// 4 9 2 
// sumrow=8+1+6=15
// sumcol=8+3+4=15
// sumrow==sumcol
// sumdiag1=8+5+2=15
// sumdiag26+5+4=15
// sumdiag1=sumdiag2=sumrow
// i=1 
// rowSum=3+5+7=15
// colSum=1+5+9=15
// i=2  
// rowSum=4+9+2=15
// colSum=6+7+2=15
// rowSum=colSum sumrow=sumcol







