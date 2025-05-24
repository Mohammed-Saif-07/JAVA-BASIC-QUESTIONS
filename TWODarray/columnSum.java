import java.util.*;
public class columnSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter coloums: ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        System.out.println("Enter matrix Elements: ");
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int j = 0;j<columns;j++){
                int sum = 0;                 
            for(int i = 0;i<rows;i++){
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}
