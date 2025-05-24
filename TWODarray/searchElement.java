import java.util.*;

public class searchElement {

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
        System.out.print("enter element to search: ");
        int targetElement = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
                if(matrix[i][j]==targetElement){
                    System.out.println("Element found at index (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
                     }
               
                 }  
                if(!found){
                    System.out.println("element not present in matrix");
               
                }
       
    }
}
