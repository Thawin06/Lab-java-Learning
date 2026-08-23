import java.util.Scanner;

public class Hw5_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int i;
        for (i = N; i >= 0; i--) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
