
/*******************************
 id 69160126
 โปรเเกรม แนะนำการออกกำลังกาย
 ********************************/
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("input temperature : ");
        int C = kb.nextInt();
        System.out.print("Input Weather : ");
        char E = kb.next().charAt(0);
        System.out.println("=== Processing ===");
        if (C <= 30) {
            if (E == 'R') {
                System.out.print("Badminton");
            } else if (E == 'S') {
                System.out.println("football");
            }
        } else if (C>30) {
            if(E == 'R'){
                System.out.println("yoga");
            } else if (E == 'S') {
                System.out.println("Swim");
            }
        }
    }
}
