package ss2_loop_in_java.exercise;
public class TheFirst20Primes {
    public static void main(String[] args) {
        for (int i = 2;i < 20 ; i++){
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + ", ");
            }
        }
    }
}
