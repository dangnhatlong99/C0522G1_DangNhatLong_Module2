package ss2_loop_in_java.practice;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw  the  triangle");
        System.out.println("2.Draw  the  square");
        System.out.println("3.Draw  the  rectangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }

    int a = (int) Math.round(12 * Math.random()) + 5;

}



