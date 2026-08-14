import java.util.Scanner;
public class Hw3_5 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int bill = kb.nextInt();
        int h;
        h = m/60;
        if(m%60>0) {
            h = h + 1;
        }
            if(bill>1000){
                System.out.println(h*0);
            } else if (bill>=500&&bill<=1000) {
                System.out.println((h-2)*10);
            } else if (bill>0&&bill<500) {
                System.out.println((h-1)*15);
            }else{
                System.out.println(h*20);
            }

            }

        }


