public class Ex1 {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        i = 0;
        while (i < 5){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i<5);
    }
}
