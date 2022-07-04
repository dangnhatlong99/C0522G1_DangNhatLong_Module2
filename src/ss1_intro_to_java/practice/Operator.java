package ss1_intro_to_java.practice;

import java.util.Scanner;

class operator_expression{
    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);// khaibáo đối tượng trong scanner
        System.out.println("Enter width");
        width = scanner.nextDouble();//Nhập chiều rộng

        System.out.println("Enter height");
        height = scanner.nextDouble();//Nhập chiều dài

        double area = width * height;
        System.out.println("Area is: "+ area);
    }
}
