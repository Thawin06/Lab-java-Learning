import java.util.Scanner;

public class Hw6_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}