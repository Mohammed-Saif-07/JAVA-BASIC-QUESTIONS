import java.util.*;

public class checkSymetric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        if (rows != columns) {
            System.out.println("Not a square matrix");
        } else {
            int matrix[][] = new int[rows][columns];
            System.out.println("Enter matrix elements");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Original matrix is");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            boolean issimilar = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        issimilar = false;
                        break;
                    }
                }
                if (!issimilar) {
                    break;
                }
            }

            if (issimilar) {
                System.out.println("symetric");
            } else {
                System.out.println(" no symmetric");
            }

            System.out.println("Transpose matrix is");
            for (int j = 0; j < columns; j++) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
