package ss3_arrays_and_methods.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so luong phan tu");
            int length = scanner.nextInt();
            int [] arr = new int[length];
            for (int i = 0; i < length; i++){
                System.out.printf("Nhap array[%d]:",i);
                arr[i] = scanner.nextInt();
            }
            System.out.println("Mang vua tao");
            System.out.println(Arrays.toString(arr));
            System.out.println("Nhap phan tu X can xoa");
            int number = scanner.nextInt();
            boolean notInArray = true;
            for (int i =0; i < arr.length; i++){
                if (number == arr[i]){
                    notInArray = false;
                    for (int j = i; j< arr.length-1; j++){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1]= temp;
                    }
                    arr[arr.length-1] = 0;
                }
            }
            if (notInArray){
                System.out.println("Khong tim thay phan tu X trong mang");
            }else {
                System.out.printf("Mang sau khi xia phan tu X: ");
                System.out.printf(Arrays.toString(arr));
            }
        }
    }
