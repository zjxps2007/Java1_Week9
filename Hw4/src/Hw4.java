public class Hw4 {
    public static void main(String[] args) {
        //선언
        int stu[][] = {{90, 80, 70}, {70, 90, 60}, {80, 40, 30}, {70, 60, 40}};
        int j, sum;
        double avg;

        // 평균을 구할
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (j = 0; j < 3; j++) {
                sum = sum + stu[i][j];
            }
            avg = (double) sum / 3.0;
            //출력
            System.out.print("학생" + i + "의 평균성적: " + avg + "\n");
        }
    }
}
