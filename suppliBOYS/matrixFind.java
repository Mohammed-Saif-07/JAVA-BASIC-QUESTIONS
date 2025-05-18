import java.util.Scanner;

public class matrixFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = new int[row1][col1];
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        boolean flag = false;
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                if(arr1[i][j]==n){
                    flag = true;
                    System.out.println(1);
                    break;
                }
                
            }
        }if(!flag){
            System.out.println(0);
        }
        
    }
}
