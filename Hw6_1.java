import java.util.Scanner;

public class Hw6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // ขอบนอกพิมพ์เลขแถว (i) ส่วนข้างในพิมพ์ = (ไม่มีเว้นวรรค)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(i);
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
