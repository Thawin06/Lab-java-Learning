import java.sql.SQLOutput;
import java.util.Scanner;

public class Hw5_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int scnum = 25;
        int r = 0;
        int N;
        int i;
        do{
            N = kb.nextInt();
            r++;
            if(N!=scnum){
                System.out.println("no");
            }else{
                System.out.print("yes ");
                System.out.print(r);
            }
        }while (N!=scnum);

        }
    }

