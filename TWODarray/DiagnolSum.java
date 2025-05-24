import java.util.*;
public class DiagnolSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("enter rows: ");
        int rows = sc.nextInt();
        System.out.print("enter columns: ");
        int columns = sc.nextInt();
         if(rows != columns){
            System.out.println("not square matrix");
        }
        else{

             int matrix[][] = new int[rows][columns];
        System.out.println("enter matrix elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();                        //1 2 
            }                                                       //3 4
        }
        System.out.println("original matrix matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<columns; j++){
                if(i == j){
                    sum = sum + matrix[i][j];
                }
            }
            
        }
       
        System.out.println("sum of diagnol is: " + sum);
        }
    }
}
