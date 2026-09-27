//ให้สร้างอาร์เรย์ 2 มิติแทนเมทริกซ์ A โดยค่าของเมทริกซ์ A มีค่าดังนี้
//int[][] matrixA = { { 1, 2, 3, 4},
//                    { 5, 6, 7, 8},
//          	     { 9, 0, 1 ,2} };
// หลังจากนั้นให้เขียนซูโดโค้ดและโปรแกรมสำหรับแสดงหาค่าที่น้อยที่สุดของแต่ละคอลัมน์ดังตัวอย่าง
//    =====  Matrix A =====
//|	1	2	3	4	|
//|	5	6	7	8	|
//|	9	0	1	2	|
//Min	1	0	1	2
import java.util.Scanner;


public class lab9_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] matrixA = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}};
        int[] b = new int[3];
        System.out.println(" "+"=====Matrix A====="+"\t"+" "+"max");
        for (int i = 0; i < matrixA.length; i++) {
            System.out.print("|  ");
            int max = 0;
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(matrixA[i][j] + "\t");
                if (matrixA[i][j] > max) {
                    max = matrixA[i][j];
                    b[i] = matrixA[i][j]; //ไว้เก็บ ค่ามากสุดของเเถว
                }
            }
            System.out.print(" | ");
            System.out.print(b[i]);;
            System.out.println();
        }
    }
}
