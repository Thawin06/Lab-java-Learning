/************************************************
 owner : Thawin mekchai *************************
 id    : 69160126 *******************************
 Work  : === Program convert arabic to roman ===*
 ************************************************/
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // สเเกนรับค่าจากคีย์บอร์ด
        int num; // ประกาศตัวเเปร
        System.out.println("=== Program convert arabic to roman ===");
        System.out.print(" input : ");
        num = kb.nextInt();
        if (num == 1) { // ระบุเงื่อนไข
            System.out.println("Output : I ");
        } else if (num == 2 ) {
            System.out.println("Output : II");
        } else if (num == 3 ) {
            System.out.println("Output : III");
        } else if (num == 4 ){
            System.out.println("Output : IV");
        } else if (num == 5 ){
            System.out.println("Output : V");
        } else if (num == 6 ){
            System.out.println("Output : VI");
        } else if (num == 7 ){
            System.out.println(" Output : VII");
        } else if (num == 8 ){
            System.out.println(" Output : VIII");
        } else if (num == 9 ){
            System.out.println(" Output : IX");
        } else if (num == 10 ) {
            System.out.println(" Output : X");
        }else{
            System.out.println("Can’t not convert to roman number, My program support only 1-10");


        }
    }
}

