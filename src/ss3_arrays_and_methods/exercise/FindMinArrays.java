package ss3_arrays_and_methods.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhap array[%d]:", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang vua tao");
        System.out.println(Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + getMinValue(arr));
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}

