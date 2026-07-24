/************************************************
 owner : Thawin mekchai *************************
 id    : 69160126 *******************************
 Work  : === Program check weather ===***********
 ************************************************/


import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double F,C;
        System.out.println("=== Program check weather ===");
        System.out.print("Input temperature (fahrenheit) : ");
        F = kb.nextDouble(); //รับค่าอุณหภูมิ
        C = (F-32)*5/9; //แปลงค่าอุณหภูมิให้เป็นองศาเซลเซียส
        System.out.println("=== processing ===");
        if(C<23){//เช็คเงื่อนไข
            System.out.printf("Temperature (celsius) : %.4f%n",C);
            System.out.println("Weather cold");
        } else if (C>=23 && C<28) {
            System.out.printf("Temperature (celsius) : %.4f%n",C);
            System.out.println("Weather cool");
        } else if(C>=28&&C<33){
            System.out.printf("Temperature (celsius) : %.4f%n",C);
            System.out.println("Weather warm");
        } else if (C>33) {
            System.out.printf("Temperature (celsius) : %.4f%n",C);
            System.out.println("Weather hot");
        }


    }
}
