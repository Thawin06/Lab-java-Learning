import java.util.Scanner;

public class Hw5_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String x;
        int i;
        if (N%2==0) {
            x = "*";
        }else {
            x="+";
        }
        for (i = 1; i <=N ; i++) {
            System.out.print(x+" ");
            }
        }
    }

