package ss1_intro_to_java.practice;

import java.util.Scanner;

public class DaysOfMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//nhập từ bàn phím

        System.out.println("Which month that you want to count days?");// tìm ngày của tháng mấy
        int month = scanner.nextInt();// tháng nhận số nguyên nên dùng int

        switch (month){
            case 2:
                System.out.print("The month'2' has 28 or 29 days!");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.print("The month "+ month + " has 31 days!");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
            System.out.print("The month "+ month + " has 30 days!");
                break;

            default:
            System.out.print("Please input correct format! ");
        }
    }
}