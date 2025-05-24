import java.util.Scanner;

public class storeNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int couunt = 0;
        System.out.print("enter rows: ");
        int rows = sc.nextInt();
        System.out.print("enter columns: ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        int res[][] = new int[rows][columns];
        System.out.println("enter matrix elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // boolean found = false;
        System.out.println("negative bno are");
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(matrix[i][j] < 0){
                    
                    // found = true;
                    res[i][j] = matrix[i][j];
                    couunt++;
                    System.out.println(res[i][j]);
                }
            }
            
        }
        System.out.println("negatibe no are : " + couunt);
    }
}
