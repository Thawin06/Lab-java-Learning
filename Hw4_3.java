import java.util.Scanner;

public class Hw4_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=a;i++){
          sum = sum + i;
        }
        System.out.print(sum);

    }

}
