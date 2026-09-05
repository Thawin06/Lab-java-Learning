
import java.util.Scanner;
public class Hw7_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int j,i;
        int n = kb.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
             if(j<=i){
                 System.out.print(j+" ");
             }
            }
            System.out.println();
        }
        }
    }
