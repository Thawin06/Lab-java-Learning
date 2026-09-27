//จงเขียนโปรแกรมรับข้อมูลจัดเก็บในอาร์เรย์ขนาด 3 x 3 ซึ่งข้อมูลที่จัดเก็บอยู่ในอาร์เรย์นั้นมีเพียง 0 กับ 1
//
//จากนั้นให้ทำการตรวจสอบว่าแถวหรือคอลัมน์ใดที่มีตัวเลขเหมือนกันทั้งหมด พร้อมทั้งระบุเบอร์ว่าตัวเลขที่เหมือนกันนั้นคือตัวเลขใด
//
//หมายเหตุ : หากมีหลายแถวหลายคอลัมน์ที่มีตัวเลขเหมือนกันทั้งหมด ให้จัดลำดับการแสดงผลดังนี้
//
//เริ่มแสดงผลจากแถวก่อนตามลำดับ (แกวที่ 0-2) แล้วตามด้วยคอลัมน์ตามลำดับ (คอลัมน์ 0-2)
import java.util.Scanner;

public class Hw9_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i, j;
        int[][] arr = new int[3][3];
        //loop input
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        //เช็คเเถว
        int c;
        for (i = 0; i < arr.length; i++) {
            boolean x = true;
            for (j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[i][0]) {
                    x = false;
                }
            }
            if (x == true) {
                System.out.println("All " + arr[i][0] + " on row " + i);
            }
        }
        for (j = 0; j < arr.length; j++) {
            boolean x = true;
            for (i = 0; i < arr[0].length; i++) {
                if (arr[i][j] != arr[0][j]) {
                    x = false;
                }
            }
            if (x==true){
                System.out.println("All " + arr[0][j] + " on column " + j);
            }
            }
        }
    }
