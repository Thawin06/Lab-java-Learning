import java.util.Scanner;

public class Hw5_5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int vowelCount = 0;
        for (int i = 1; i <= n; i++) {
            char ch = scanner.next().charAt(0);
            char upperCh = Character.toUpperCase(ch);
            if (upperCh == 'A' || upperCh == 'E' || upperCh == 'I' || upperCh == 'O' || upperCh == 'U') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}