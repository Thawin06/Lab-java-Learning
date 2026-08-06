/*******************************
 id 69160126
 Program discount price
 ********************************/
import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("=== Program discount price ===");
        System.out.print("Input status of member : ");
        char x = kb.next().charAt(0);
        System.out.print("Input price : ");
        int s = kb.nextInt();
        System.out.println("=== Calculate total price ===");
       switch (x){
           case 'Y':
               if (s>0&&s<=500){
                   System.out.println("Total Price : "+s);
               } else if (s>500&&s<=1000){
                   System.out.println("Total Price : "+(s-(s*(3.0/100))));
               }else if (s>1000&&s<=2000){
                   System.out.println("Total Price : "+(s-(s*(4.0/100))));
               }else if (s>2000&&s<=5000){
                   System.out.println("Total Price : "+(s-(s*(7.0/100))));
               }else{
                   System.out.println("Total Price : "+(s-(s*(10.0/100))));
               }
               break;
           case 'N':
               if (s>0&&s<=500){
                   System.out.println("Total Price : "+s);
               } else if (s>500&&s<=1000){
                   System.out.println("Total Price : "+s);
               }else if (s>1000&&s<=2000){
                   System.out.println("Total Price : "+(s-(s*(3.0/100))));
               }else if (s>2000&&s<=5000){
                   System.out.println("Total Price : "+(s-(s*(3.0/100))));
               }else{
                   System.out.println("Total Price : "+(s-(s*(7.0/100))));
               }
               break;
       }
    }
}
