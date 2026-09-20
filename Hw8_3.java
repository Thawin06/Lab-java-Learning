//จงเขียนโปรแกรมรับค่าจำนวนเต็ม 1 จำนวน (N) จากนั้นวนรับข้อมูลตัวเลขจำนวนเต็มอีก N จำนวน
//
//เมื่อรับค่าเสร็จสิ้น ให้ทำการหาผลรวมของตัวเลขทุกจำนวน ยกเว้น ตัวเลขที่มีค่าน้อยที่สุด แล้วแสดงผลลัพธ์ทางหน้าจอ
import java.util.Scanner;

public class Hw8_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] x = new int[n];
        for (int i = 0;i<n;i++){
            x[i]= kb.nextInt();
        }
        int c=0;
        int min=100000000;
        for (int i = 0;i<n;i++){
          if (x[i]<min){
              min = x[i];
              c=1;
          } else if (x[i]==min) {
              c++;

          }
        }
        int sum = 0;
        int a=0;

        for (int i = 0;i<n;i++){
            sum+=x[i];
        }
        a = sum-(min*c);
        System.out.println(a);
    }
}
