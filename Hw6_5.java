import java.util.Scanner;

public class Hw6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // ความยาวทั้งหมดของแต่ละแถว = 2 * n - 1
        int totalWidth = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            // จำนวนของ '=' ที่อยู่ฝั่งซ้ายและขวาเท่ากับ i
            int equalsCount = i;
            // จำนวนของ '+' ตรงกลางเท่ากับ totalWidth - (2 * i)
            int plusCount = totalWidth - (2 * i);

            // พิมพ์ '=' ซ้าย
            for (int j = 0; j < equalsCount; j++) {
                System.out.print("=");
            }
            // พิมพ์ '+' ตรงกลาง
            for (int j = 0; j < plusCount; j++) {
                System.out.print("+");
            }
            // พิมพ์ '=' ขวา
            for (int j = 0; j < equalsCount; j++) {
                System.out.print("=");
            }

            // ขึ้นบรรทัดใหม่
            System.out.println();
        }

        scanner.close();
    }
}