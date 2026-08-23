import java.util.Scanner;

public class Hw5_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int sum, i;
        sum = 0;
        for (i = a; i <= b; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
            }
        System.out.println();
        System.out.print(sum);
        }
    }
