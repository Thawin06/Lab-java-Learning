
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int H = kb.nextInt();
        int Min = kb.nextInt();
        int pass = kb.nextInt();
        int NMIN = (Min +pass )%60 ;
        int NH = (Min + pass )/ 60 ;
        int LastH = NH + H ;


        if (LastH <= 23){
            System.out.printf("%02d", LastH);
            System.out.print(":");
            System.out.printf("%02d",NMIN);
        }
        else{
            int MIDN = LastH - 24 ;
            System.out.printf("%02d", MIDN);
            System.out.print(":");
            System.out.printf("%02d",NMIN);


        }
    }
}

