import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        //입력받음
        System.out.print("양의 점수를 입력하세요:");
        num = sc.nextInt();

        System.out.println("30의 약수는 다음과 같습니다.");
        //약수 구함
         for(int i =1;i<=num;i++) {
             //입력받은수를  i로 나눔
             if(num%i==0) {
                 //출력
                 System.out.print(i+" ");
             }
         }
    }
}
