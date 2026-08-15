import java.util.Scanner;

public class Hw4_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int i;
        for(i=1;i<=12;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
}