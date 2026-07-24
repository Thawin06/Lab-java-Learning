/************************************************
 owner : Thawin mekchai *************************
 id    : 69160126 *******************************
 Work  : === Calculate net price ===***********
 ************************************************/
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int P,P2; //ประกาศตัวเเปร
        System.out.println("=== Program discount price ===");
        System.out.print("Input price : ");
        P = kb.nextInt();//รับข้อมูลจากคีย์บอร์ด
        System.out.println("=== Calculate total price ===");
        if(P>=1&&P<=500) {//เช็คเงื่อนไข
            P2 = P - 0;//คำนวณราคาสุทธิ
            System.out.println("Total Price : "+P2);
        } else if ( P>=501&&P<=1000) {
            P2 = P-(P*3/100);
            System.out.println("Total Price : "+P2);
        } else if (P>=1001&&P<=2000) {
            P2 = P-(P*4/100);
            System.out.println("Total Price : "+P2);
        } else if (P>=2001&&P<=5000) {
            P2 = P-(P*7/100);
            System.out.println("Total Price : "+P2);
        } else if (P>=5001) {
            P2 = P-(P*10/100);
            System.out.println("Total Price : "+P2);
        }


    }
}
