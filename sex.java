/****************
 id 69160126
 โปรเเกรม ตรวจสอบเพศ เเละระบุช่วงวัยที่เรียก
 ****************/
import java.util.Scanner;
public class sex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("input sex : ");
        char type = kb.next().charAt(0);
        System.out.print("input age : ");
        int age = kb.nextInt();
        System.out.println("=== Processing ===");
        if (type != 'M' && type != 'F' || age <= 0) {
        System.out.println("Don’t know, what you are");
        }else if (type == 'M' && age < 15) {
            System.out.println("You are a boy");
        } else if (type == 'M' && age >= 15) {
            System.out.println("You are a man");
        } else if (type == 'F' && age < 15) {
            System.out.println("You are a girl");
        } else if (type == 'F' && age >= 15) {
            System.out.println("You are a woman");
        }
        }
    }

