import java.util.Scanner;

public class Hw3_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int y = kb.nextInt();
        if (y%400==0){
            System.out.println("leap year");
        } else if (y%100==0) {
            System.out.println("common year");
        } else if (y%4==0) {
            System.out.println("leap year");
        }else{
            System.out.println("common year");
        }
    }
}
