import java.util.Scanner;

public class Hw7_2 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int j,i;
        int n = kb.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>=1;j--){
                if(j>=i){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
