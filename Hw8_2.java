
//พนักงานคนหนึ่งกำลังยื่นบัตรคิวเข้าคอนเสิร์ตให้กับผู้มาชมคอนเสิร์ตจำนวน n คน ซึ่งบัตรคิวมีหลายรูปแบบ หลังจากพนักงานยื่นบัตรไปแล้ว เกิดอยากทราบว่ามีคนที่ได้บัตรหมายเลข x รูปแบบเดียวกันจำนวนกี่คน
//
//จงเขียนโปรแกรมรับจำนวนผู้มาชมคอนเสิร์ต (n) และหมายเลขบัตรคิวของ n คนนั้น และหมายเลขบัตรที่พนักงานต้องการทราบ (x) จากนั้นให้ทำการนับว่า ในบรรดาผู้มาชมคอนเสิร์ตทั้งหมดมีคนได้บัตรหมายเลข x กี่คน
import java.util.Scanner;

public class Hw8_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       int n = kb.nextInt();
       int[] z = new int[n];
       for (int i = 0;i< z.length;i++){
           z[i]=kb.nextInt();
       }
       int x =kb.nextInt();
       int c=0;
       for (int i =0;i<n;i++){
           if (z[i]==x){
               c++;
           }
       }
        System.out.println(c);
    }
}
