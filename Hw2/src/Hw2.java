import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        int [] set = new int[10];
        int setnum;
        Scanner sc = new Scanner(System.in);


        for(int i =0;i<10;i++) {
            set[i]=0;
        }

        while(true) {
            System.out.println("\n-----------");
            for(int i = 0;i<10;i++) {
                System.out.print(i+1);
            }
            System.out.println("\n-----------");
            for(int i=0;i<10;i++) {
                System.out.print(set[i]);
            }
            System.out.println("\n-------------");

            System.out.println("원하시는 좌석번호를 입력하세요(죵료는 -1):");
            setnum = sc.nextInt();


            if(setnum == -1) {
                break;
            }

            else if(set[setnum-1] == 1){
                System.out.println("이미 예약된 자리입니다.");
            }

            else {
                System.out.println("예약되었습니다.");
                set[setnum-1]=1;
            }
        }
    }
}
