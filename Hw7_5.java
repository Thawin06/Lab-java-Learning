import java.util.Scanner;

public class Hw7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 1. ส่วนยอดสุด (แกนกลาง | บรรทัดแรก)
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        System.out.println(" | ");

        // 2. ส่วนใบต้นคริสต์มาส (วนลูป n บรรทัด)
        for (int i = 1; i <= n; i++) {
            // ช่องว่างด้านซ้าย
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // ดอกจันฝั่งซ้าย
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // แกนกลาง
            System.out.print(" | ");
            // ดอกจันฝั่งขวา
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. ส่วนลำต้น (แกนกลาง | บรรทัดล่างสุด)
        for (int j = 1; j <= n; j++) {
            System.out.print(" ");
        }
        scanner.close();
    }
}