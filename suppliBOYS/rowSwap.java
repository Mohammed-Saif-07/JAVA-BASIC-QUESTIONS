import java.util.Scanner;

public class rowSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] temp = arr[0];
        arr[0] = arr[row-1];
        arr[row-1] = temp;

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
