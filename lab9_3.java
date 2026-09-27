//เมทริกซ์สมมาตร คือ เมทริกซ์จัตุรัสที่เมื่อสลับเปลี่ยน (transpose) แล้วจะได้ผลลัพธ์เป็น เมทริกซ์ตัวเอง นั่นคือ A = AT
//ตัวอย่างต่อไปนี้คือเมทริกซ์สมมาตร ในมิติ 3×3
//
//จงเขียนโปรแกรมรับค่าเมทริกซ์ขนาด 3 x 3 แล้วตรวจสอบว่า เมทริกซ์นั้นเป็นเมทริกซ์สมมาตรหรือไม่
//Ans
import java.util.Scanner;

public class lab9_4 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int[][] arr1 = {{1,2,3},{2,4,-5},{3,-5,6}};
        int[][] arr2 = new int[3][3];
        for (int i =0;i< arr2.length;i++){
        for (int j = 0; j < arr2[0].length; j++) {
            arr2[i][j]= kb.nextInt();
        }
        }
        boolean isE =true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (arr1[i][j]==arr2[i][j]){
                    isE =true;
                }else{
                    isE =false;
                    break;
                }
            }
            if (isE==false){
                break;
            }

        }
        if (isE =true){
            System.out.println("สมมาตรกัน");
        }else{
            System.out.println("ไม่สมมาตรกัน");
        }
    }
}
