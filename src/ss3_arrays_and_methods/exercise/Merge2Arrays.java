package ss3_arrays_and_methods.exercise;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int [] arr1 = new int []{1,2,3,4,5};
        int [] arr2 = new int []{6,7,8};
        int [] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int j =0; j < arr2.length;j++){
            arr3[arr1.length + j] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
