/*
จงเขียนโปรแกรมรับค่าตัวเลขจำนวนเต็ม 1 จำนวน

หลังจากนั้นทำการตรวจสอบว่าตัวเลขนั้นหารด้วย 3 และ 5 ลงตัวหรือไ่ม่

ถ้าหารด้วย 3 และ 5 ลงตัว ให้แสดงคำว่า Yes

ถ้าหารลงตัวเพียงตัวใดตัวหนึ่ง ให้แสดงคำว่า No

หรือหารไม่ลงตัวทั้ง 3 และ 5 ให้แสดงคำว่า No เช่นกัน
 */
import java.util.Scanner;

public class HW2 {

   public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N;
        N = kb.nextInt();
        if(N%3==0&&N%5==0){
            System.out.println("Yes");
        }else if((N%3==0&&N%5!=0)||(N%3!=0&&N%5==0)){
            System.out.println("No");
        }else if(N%3!=0&&N%5!=0){
    }
}
}