import java.util.Scanner;

public class Hw4_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int i;
        int sum;
        if (a <= b) {
            for (i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    if (i <= b) {
                        System.out.print(i + " ");
                    }
                }
            }

        } else if (a >= b) {
            for (i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    if (i <= a) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}