import java.util.Scanner;

public class Hw4_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int i;
        int sum = 0;
        if (b >= a)
            for (i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        else if (b <= a) {
            for (i = b; i <= a; i++) {
                System.out.print(i+" ");


            }
        }
    }
}


