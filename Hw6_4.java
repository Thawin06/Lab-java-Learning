import java.util.Scanner;

public class Hw6_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i, j;
        int m = kb.nextInt();
        int n;
        String s1 = "<";
        String s2 = ">";
        do {
            n = kb.nextInt();
        } while (n % 2 != 0);
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n / 2; j++) {
                System.out.print(s2);
            }
            for (j = 1; j <= n / 2; j++) {
                System.out.print(s1);
            }
            System.out.println();
        }
    }
}

