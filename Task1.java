/*****************************************
 owner : Thawin mekchai ******************
 id    : 69160126 ************************
 Work  : Check if it is greater than zero*
 *****************************************/
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // สเเกนรับค่าจากคีย์บอร์ด
        int num; // ประกาศตัวเเปร
        System.out.print("input num : ");
        num = kb.nextInt();
        if (num > 0) { // ระบุเงื่อนไข
            System.out.println("your number more than zero");
        } else if (num <= 0) {
            System.out.println("your number less or equal zero");
        }
    }
}
