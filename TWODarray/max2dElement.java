import java.util.*;

public class max2dElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int rows = sc.nextInt();
        System.out.print("enter columns: ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        System.out.println("enter matrix elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // System.out.print(matrix[i][j] + " ");
                 int max = matrix[0][0];
        for( i = 0; i<matrix.length;i++){
            for( j = 0; j<matrix.length;j++){
            if(matrix[i][j]>max){
                max = matrix[i][j];
            }
        }
        }
        System.out.println(max);
            }
            System.out.println();
            
        }
       
      
    }
}
