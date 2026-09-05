import java.util.Scanner;

public class Hw7_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i, j;
        int n = kb.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j >0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
