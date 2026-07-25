/*
จงเขียนโปรแกรมสำหรับตรวจสอบจำนวนเต็ม

โดยทำการรับค่าตัวเลขจำนวนเต็ม 1 จำนวน

หลังจากนั้นให้ทำการตรวจสอบตัวเลขดังกล่าว

ถ้าเป็นจำนวนเต็มลบ ให้แสดงคำว่า Negative

ถ้าเป็นศูนย์ ให้แสดงคำว่า Zero

ถ้าเป็นจำนวนเต็มบวก ให้แสดงคำว่า Positive
 */
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
int N;
N = kb.nextInt();
 if(N<0){
    System.out.println("Negative");
} else if (N==0) {
     System.out.println("Zero");
 } else if (N>0) {
     System.out.println("Positive");
     
 }
    }
    }
