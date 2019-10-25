import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("학생 수 입력: ");
        int st = sc.nextInt();
        int[] arr = new int[st];

        for(int i =0;i<arr.length;i++) {
            System.out.print("학생"+i+"의 점수: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("검색할 점수: ");
        num = sc.nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                System.out.println(num+"점은 "+(arr.length-i)+"등입니다.");
            }
        }
    }
}
