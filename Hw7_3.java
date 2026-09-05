import java.util.Scanner;

public class Hw7_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i, j;
        int n = kb.nextInt();
        //n =(n*2)-1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        for (i = n; i >=1; i--) {
            for (j = 1; j<= n; j++) {
                if (j < i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

