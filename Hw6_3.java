import java.util.Scanner;

public class Hw6_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int i,j;
        String s1 = "<";
        String s2 = ">";
        int x = kb.nextInt();
        for(i=1;i<=x;i++){// BT
            for(j=1;j<=x;j++){
                if(i%2!=0){
                    System.out.print(s2);
                }else{
                    System.out.print(s1);
                }
            }
            System.out.print(" ");
            for(j=1;j<=x;j++){
                if(i%2!=0){
                    System.out.print(s1);
                }else{
                    System.out.print(s2);
                }
            }
            System.out.println();
        }
    }
}
