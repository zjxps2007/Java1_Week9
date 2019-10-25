import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        int arr[][];
        int cnt =1;

        System.out.print("행 입력: ");
        row = scan.nextInt();

        System.out.print("열 입력: ");
        col = scan.nextInt();

        arr = new int[row][col];

        for(int i =0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++) {
                arr[i][j] = cnt++;
            }
        }
        for(int i =0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
