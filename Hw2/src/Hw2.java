import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        //선언
        int [] set = new int[10];
        int setnum;
        Scanner sc = new Scanner(System.in);

        //배열을 초기화
        for(int i =0;i<10;i++) {
            set[i]=0;
        }
        //-1이 나올떄 까지 반복
        while(true) {
            System.out.println("\n-----------");
            //1~10까지 출력
            for(int i = 0;i<10;i++) {
                System.out.print(i+1);
            }
            System.out.println("\n-----------");
            //배열에 1을 집어 넣음
            for(int i=0;i<10;i++) {
                System.out.print(set[i]);
            }
            System.out.println("\n-------------");

            System.out.println("원하시는 좌석번호를 입력하세요(죵료는 -1):");
            setnum = sc.nextInt();

            //-1일때
            if(setnum == -1) {
                break;
            }
            //배열의 자리가 1일경우
            else if(set[setnum-1] == 1){
                System.out.println("이미 예약된 자리입니다.");
            }
            //배열의 자리가 0일경우
            else {
                System.out.println("예약되었습니다.");
                set[setnum-1]=1;
            }
        }
    }
}
