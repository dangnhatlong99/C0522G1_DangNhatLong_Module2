package ss1_intro_to_java.exercise;

import java.util.Scanner;

public class VndToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Vnd, Usd;
        System.out.print("Input USD:");
        Usd = scanner.nextDouble();

        Vnd = Usd * 23000;

        System.out.println(Vnd + "VND");
    }
}
