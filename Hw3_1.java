import java.util.Scanner;

/****************************
id 69160126
โปรแกรมรับค่าตัวเลขจำนวนเต็ม 2 จำนวน
*****************************/
public class Hw3_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        char x = kb.next().charAt(0);
        switch (x){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                    break;
            case '/':
                System.out.println(n1/n2);
                break;
            }
        }
        }

