import java.util.Scanner;

public class Hw9_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] arr = new char[3][3];
        int i,j;
        for (i=0;i< arr.length;i++){
            for (j=0;j<arr[0].length;j++){

                arr[i][j]= kb.next().charAt(0);
            }
        }
        int c0 =0;
        int c1 = 0;
        for (i=0;i< arr.length;i++){
            for (j=0;j<arr[0].length;j++) {
                if (i==1&&j==1){
                    continue;
                }
                if(arr[i][j]=='0'){
                    c0++;
                } else if (arr[i][j]=='1') {
                    c1++;
                }
            }
            }
        boolean leftRightZero =
                arr[1][0] == '0' && arr[1][2] == '0';

        if (c1 == 8) {
            System.out.println("1");
        } else if (c0 > 4 || leftRightZero) {
            System.out.println("0");
        } else {
            System.out.println("X");
        }
    }
}
