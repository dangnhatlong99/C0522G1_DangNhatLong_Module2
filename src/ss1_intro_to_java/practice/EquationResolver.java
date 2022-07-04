package ss1_intro_to_java.practice;

import java.util.Scanner;

public class EquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x +b =c' please enter constant:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();// bậc nhất nhận số thưc hoặc số nguyên nên dùng double

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double answer = ( c- b ) / a;
            System.out.printf("Equation pass with x =%f!\n", answer);//printf định dạng những thứ ỉn ra: num,string,date,..
        } else {
            if (b == c){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution");
            }
        }
    }
}
