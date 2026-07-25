/*
จงเขียนโปรแกรมรับค่าตัวเลขจำนวนเต็ม 3 จำนวน หลังจากนั้นทำการประมวลผลว่าตัวเลขตัวใดมีค่าน้อยที่สุดและแสดงออกทางจอภาพ
 */
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a, b, c;
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else if (c <= a && c <= b) {
            System.out.println(c);
        }
    }
}