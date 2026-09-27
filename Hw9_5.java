//จงเขียนโปรแกรมเพื่อรับขนาดของอาร์เรย์ 2 มิติ คือ (m และ n) ต่อด้วยการรับค่าของสมาชิก แต่ละตัว
//
//หลังจากนั้น นับตัวเลข 2 ตัวแทนพิกัด (x,y) เพื่อแสดงผลตามเงื่อนไขต่อไปนี้
//
//ถ้าข้อมูลด้านบนและด้านล่างของค่าข้อมูลในพิกัด (x,y) เป็นเลข 1 ทั้งคู่ให้แสดง true
//ถ้าข้อมูลด้านซ้ายและด้านขวาของค่าค่าข้อมูลในพิกัด (x,y) เป็นเลข 1 ทั้งคู่ให้แสดง true
//ถ้าเป็นกรณีอื่น ให้แสดง flase
//หมายเหตุ : เริ่มนับสมาชิกตัวแรกของอาร์เรย์อยู่ในพิกัด 0 0
import java.util.Scanner;

public class Hw9_5 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0;i< arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j]= kb.nextInt();
            }
        }
        int x= kb.nextInt();
        int y= kb.nextInt();
        if (x>0&&x<m-1) {
            if (arr[x - 1][y] == 1 && arr[x + 1][y] == 1) {
                System.out.println("true");
                return;
            }
        }
        // ซ้ายและขวาเป็น 1
        if (y>0&&y<n-1) {
        if (arr[x][y - 1] == 1 && arr[x][y + 1] == 1) {
                System.out.println("true");
                return;
            }
        }
        // กรณีอื่น
            System.out.println("false");
        }
    }


