import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] =  new int[5];
        int n;

        for(int i =0; i< arr.length; i++) {
            System.out.print("배열의 인덱스"+i+"의 원소: ");
            arr[i] = scan.nextInt();
        }
        System.out.println();

        System.out.print("찾으려는 원소를 입력하세요:");
        n = scan.nextInt();

        for(int i =0; i<arr.length;i++) {
            if (arr[i] == n) {
                System.out.print(n+"은 배열의"+i+"위치에 있습니다.");
            }
        }
    }
}
