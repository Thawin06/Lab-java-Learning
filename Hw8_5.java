//จงเขียนโปรแกรมรับค่าตัวเลขจำนวนเต็ม (n) แทนจำนวนนักเรียน
//
//หลังจากนั้นสร้างตัวแปรอาร์เรย์ 2 ตัว แต่ละตัวมีขนาด n
//
//โดยตัวแรกมีชนิดข้อมูลเป็น String สำหรับเก็บชื่อนักเรียน
//ส่วนอาร์เรย์ตัวที่สองมีชนิดข้อมูลเป็น int สำหรับเก็บค่าคะแนนของนักเรียน
//จากนั้นให้วนรับค่าชื่อและคะแนนของนักเรียนทั้งหมด n รอบ แล้วประมวลผลหาว่านักเรียนคนใดได้คะแนนมากที่สุดและนักเรียนคนใดได้คะแนนน้อยที่สุด
import java.util.Scanner;

public class Hw8_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] x = new String[n];
        int[] y = new int[n];
        int i,k;
        for (i = 0; i < n; i++) {
                x[i] = kb.next();
                y[i]= kb.nextInt();
            }
        int max=y[0];
        int min=y[0];
        for (i=0;i<n;i++) {
            if (y[i] > max) {
                max = y[i];
            }
            if (y[i] < min) {
                min = y[i];
            }
        }
            for (i=0;i<n;i++) {
                if (y[i] == max) {
                    System.out.println(x[i]);
                    break;
                }
            }
        for (i=0;i<n;i++) {
                if (y[i]==min){
                    System.out.println(x[i]);
                    break;
                }
            }

}

        }


