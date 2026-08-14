import java.util.Scanner;

public class Hw3_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int d = kb.nextInt();
        int m = kb.nextInt();
        int y = kb.nextInt();
        switch (m) {
            case 1:
                if (d >= 1 && d <= 31) System.out.println(d + " JAN " + y);
                else System.out.println("Invalid");
                break;
            case 2:
                boolean isLeap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
                int maxFEB = isLeap ? 29 : 28;

                if (d >= 1 && d <= maxFEB) System.out.println(d + " FEB " + y);
                else System.out.println("Invalid");
                break;
            case 3:
                if (d >= 1 && d <= 31) System.out.println(d + " MAR " + y);
                else System.out.println("Invalid");
                break;
            case 4:
                if (d >= 1 && d <= 30) System.out.println(d + " APR " + y);
                else System.out.println("Invalid");
                break;
            case 5:
                if (d >= 1 && d <= 31) System.out.println(d + " MAY " + y);
                else System.out.println("Invalid");
                break;
            case 6:
                if (d >= 1 && d <= 30) System.out.println(d + " JUN " + y);
                else System.out.println("Invalid");
                break;
            case 7:
                if (d >= 1 && d <= 31) System.out.println(d + " JUL " + y);
                else System.out.println("Invalid");
                break;
            case 8:
                if (d >= 1 && d <= 31) System.out.println(d + " AUG " + y);
                else System.out.println("Invalid");
                break;
            case 9:
                if (d >= 1 && d <= 30) System.out.println(d + " SEP " + y);
                else System.out.println("Invalid");
                break;
            case 10:
                if (d >= 1 && d <= 31) System.out.println(d + " OCT " + y);
                else System.out.println("Invalid");
                break;
            case 11:
                if (d >= 1 && d <= 30) System.out.println(d + " NOV " + y);
                else System.out.println("Invalid");
                break;
            case 12:
                if (d >= 1 && d <= 31) System.out.println(d + " DEC " + y);
                else System.out.println("Invalid");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
