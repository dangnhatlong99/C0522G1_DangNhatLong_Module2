package ss1_intro_to_java.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();

        System.out.println("Hello Babe " + name);
    }
}
