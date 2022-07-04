package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.printf("Nhập số nguyên tố cần in ra");
        num = input.nextInt();
        for (int i = 2;i < num ; i++){
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