//จงสร้างอาร์เรย์เก็บค่าจำนวนเต็มชนิด int จำนวน n ตัวที่รับมาจาก keyboard

//บรรทัดแรกของข้อมูลเข้า คือ จำนวนข้อมูล (n)
//บรรทัดถัดมาคือ คือ ตัวเลขทั้งหมด n ตัวที่ต้องการเก็บไว้ในอาร์เรย์ จากนั้นแสดงผลลัพธ์จำนวน 4 บรรทัด ดังนี้

//ผลบวกของจำนวนเต็มทั้งหมด n จำนวน
//ค่าที่มากที่สุดของจำนวนเต็มทั้งหมด
//index ของอาร์เรย์ที่เก็บค่ามากที่สุดไว้ (ถ้าค่ามากที่สุดเท่ากันอยู่หลายที่ ตอบตำแหน่งแรกที่เจอ) โดยนับตำแหน่งแรกเป็นตำแหน่งที่ 0
//จำนวนสมาชิกที่มีค่าเท่ากับค่าที่น้อยที่สุดในอาร์เรย์
import java.util.Scanner;

public class Hw8_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] x = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            x[i] = kb.nextInt();
        }
        int sum = 0;
        for (i = 0; i < n; i++) {
            sum += x[i];
        }
        int max = x[0];
        for (i = 0; i < n; i++) {
            if (x[i] > max) {
                max=x[i];
            }
        }
        int index=0;
        for (i=0;i<n;i++){
            if (x[i]==max){
                index=i;
                break;
            }
        }
        int min =x[0];
        int c=0;
        for (i=0;i<n;i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
            for (i=0;i<n;i++){
                if (x[i]==min){
                    c++;
                }
            }
            System.out.println(sum);
            System.out.println(max);
            System.out.println(index);
            System.out.println(c);
        }
    }

