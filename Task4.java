/************************************************
 owner : Thawin mekchai *************************
 id    : 69160126 *******************************
 Work  : === Check if it is a vowel. ===***********
 ************************************************/
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String Z, S ;
        Z = kb.next();//รับค่าจากคีย์บอร์ด
        S = "aeiouAEIOU"; // เก็บ"aeiouAEIOU" ในS
        if (S.contains(Z)) { //เช็คเงื่อนไขว่า Z อยู่ใน S รึเปล่า
            System.out.println("Vowel");
        } else {
            System.out.println("No Vowel");
        }
    }
}
