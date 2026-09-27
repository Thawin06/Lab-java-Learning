//สลับเเถวเป็คลอลั่ม
import java.util.Scanner;

public class Hw9_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i, j;
        int m = kb.nextInt();
        int n = kb.nextInt();
        int[][] arr = new int[m][n];
        for (i = 0;i<arr.length;i++){
            for (j=0;j<arr[i].length;j++){
                arr[i][j]= kb.nextInt();
            }
        }
        for (i=0;i<arr[0].length;i++){ //3
            for (j=0;j< arr.length;j++){ //2
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
