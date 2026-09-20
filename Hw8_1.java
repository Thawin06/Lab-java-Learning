//จงเขียนโปรแกรมเพื่อรับเลขจำนวนเต็ม 1 จํานวน (n) จากนั้นวนรับเลขให้ครบ n จํานวนนั้น จากนั้นรับเลขอีก 2 จํานวน เก็บใน s และ e แทน index ของอาร์เรย์เริ่มต้นและสิ้นสุด ที่ต้องการให้แสดงค่าข้อมูลออกทางหน้าจอ
//
//ผลลัพธ์ของโปรแกรมมีทั้งหมด 2 บรรทัด
//
//บรรทัดแรกแสดงข้อมูลทั้งหมด n ตัวที่ถูกเก็บในอาร์เรย์
//บรรทัดที่สองแสดงข้อมูลตั้งแต่ index ที่ s ถึง e ทางหน้าจอ (ถ้า index ที่ผู้ใช้ป้อนมาใน s และ e ไม่อยู่ในขอบเขตของอาร์เรย์ให้แสดงข้อความว่า Your index invalid.)
import java.util.Scanner;

public class Hw8_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] x = new int[n];
        int i, s, e;
        boolean r = false;
        for (i = 0; i < x.length; i++) {
            x[i] = kb.nextInt();
        }
        s = kb.nextInt();
        e = kb.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        if (s >= 0 && e < n && s <= e) {
            for (i = s; i <= e; i++) {
                System.out.print(x[i] + " ");
            }
        } else {
            System.out.print("Your index invalid.");
        }
    }
}