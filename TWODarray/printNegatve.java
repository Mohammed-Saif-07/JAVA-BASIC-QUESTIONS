import java.util.Scanner;

public class printNegatve {
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
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean found = false;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<rows;j++){
                if(matrix[i][j] < 0){
                    System.out.println("negative no in matrix are : " + matrix[i][j]);
                    found = true;
                    
                }
            }
                // if(found){
                //     break;
                // }
            }
                if(!found){
                System.out.println("elemnt no negativ");
         }
    }
}
