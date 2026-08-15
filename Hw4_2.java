import java.util.Scanner;

public class Hw4_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int i ;
        int sum = 0;
        for(i=1;i<=b;i++){
            sum = sum+a;
            System.out.print(a);
            if(i<b){
                System.out.print(" + ");
            }else{
                System.out.println(" = "+sum);
            }
        }
    }
}
