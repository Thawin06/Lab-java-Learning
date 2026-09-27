// จงเขียนโปรแกรมสำหรับพิมพ์ค่าอาร์เรย์ขนาด 4*4 โดยอาร์เรย์มีค่าดังนี้
//int[][] arr = { {4, 6, 4, 9}, {5, 3, 2, 0}, {6, 5, 0, 12}, {3, 1, 9, 8} };
//แล้วทำการหาค่าผลรวมของแต่ละแถวและแต่ละคอลัมน์ของอาร์เรย์ 2 มิติ และแสดงผลดังนี้
//
//col1	col2	col3	col4	Total
//row1	4	6	4	9	23
//row2	5	3	2	0	10
//Row3	6	5	0	12	23
//Row4	3	1	9	8	21
//Total	18	15	15	29	77
//Ans
public class lab9_1 {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 6, 4, 9},
                {5, 3, 2, 0},
                {6, 5, 0, 12},
                {3, 1, 9, 8}
        };

        int[] colSum = new int[4];
        int grandTotal = 0;

        // พิมพ์หัวข้อคอลัมน์
        System.out.printf("%-8s%-6s%-6s%-6s%-6s%-6s%n", "", "col1", "col2", "col3", "col4", "Total");

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;

            if (i < 2) {
                System.out.printf("%-8s", "row" + (i + 1));
            } else {
                System.out.printf("%-8s", "Row" + (i + 1));
            }

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-6d", arr[i][j]);
                rowSum += arr[i][j];
                colSum[j] += arr[i][j]; // สะสมผลรวมแยกตามคอลัมน์
            }

            System.out.printf("%-6d%n", rowSum);
            grandTotal += rowSum; // สะสมผลรวมทั้งหมด
        }

        System.out.printf("%-8s", "Total");
        for (int j = 0; j < colSum.length; j++) {
            System.out.printf("%-6d", colSum[j]);
        }
        System.out.printf("%-6d%n", grandTotal);
    }
}