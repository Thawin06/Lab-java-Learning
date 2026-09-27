import java.util.Scanner;

public class Hw9_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = kb.nextInt();
        }
        char[][] led = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                led[i][j] = ' ';
            }
        }
        if (a[0] == 1) {
            led[0][1] = '_';
        }

        if (a[2] == 1) {
            led[1][1] = '_';
        }

        if (a[5] == 1) {
            led[2][1] = '_';
        }

        // ขีดแนวตั้ง
        if (a[1] == 1) {
            led[1][0] = '|';
        }

        if (a[3] == 1) {
            led[1][2] = '|';
        }

        if (a[4] == 1) {
            led[2][0] = '|';
        }

        if (a[6] == 1) {
            led[2][2] = '|';
        }

        // แสดงผล
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(led[i][j]);
            }
            System.out.println();
        }
    }
}
