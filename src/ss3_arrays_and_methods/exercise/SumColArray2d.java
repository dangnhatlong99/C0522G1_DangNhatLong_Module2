package ss3_arrays_and_methods.exercise;

import java.util.Scanner;

public class SumColArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang ");
        int row = scanner.nextInt();
        System.out.println("Nhap so cot");
        int col = scanner.nextInt();
        double[][] arr2d = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap matrix[%d][%d] :", i, j);
                arr2d[i][j] = scanner.nextDouble();
            }
        }
        int indexCol;
        boolean isNotIndexCol;
            do {
                System.out.println("Nhập cột cần tính tổng: ");
                indexCol = scanner.nextInt();
                isNotIndexCol = indexCol < 0 || indexCol > col - 1;
                if (isNotIndexCol) {
                    System.out.println("Nhập lại cột cần tính tổng: ");
                }
            } while (isNotIndexCol);

            double sum = 0;
            System.out.println("Các phần tử trong cột cần tính tổng: ");
            for (double[] element : arr2d) {
                System.out.println(element[indexCol]);
                sum += element[indexCol];
            }
            System.out.printf("Tổng các phần tử trong cột %d là:%10.2f", indexCol, sum);
        }
    }

