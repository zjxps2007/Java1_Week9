import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("양의 점수를 입력하세요:");
        num = sc.nextInt();

        System.out.println("30의 약수는 다음과 같습니다.");
         for(int i =1;i<=num;i++) {
             if(num%i==0) {
                 System.out.print(i+" ");
             }
         }
    }
}
