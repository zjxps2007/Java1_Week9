import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        //입력받은대로 배열생성
        System.out.print("학생 수 입력: ");
        int st = sc.nextInt();
        int[] arr = new int[st];
        //생성된 배열만큼 값을 집어넣음
        for(int i =0;i<arr.length;i++) {
            System.out.print("학생"+i+"의 점수: ");
            arr[i] = sc.nextInt();
        }
        //정렬
        Arrays.sort(arr);

        System.out.print("검색할 점수: ");
        num = sc.nextInt();
        //검색해서 맞는 값을 출력
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                System.out.println(num+"점은 "+(arr.length-i)+"등입니다.");
            }
        }
    }
}
