package ss1_intro_to_java.practice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.printf("%d is a leap year", year);
            } else {
                System.out.printf("%d is NOT a leap year", year);
            }
        } else if (year % year != 0 ){
            System.out.print("please input correct format");

        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}