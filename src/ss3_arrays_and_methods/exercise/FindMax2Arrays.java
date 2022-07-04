package ss3_arrays_and_methods.exercise;

class FindMax2Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[][] { {9, 1, 0, 2},{0, 2, 6, 3, 81, 28}};
        System.out.println(getMaxValue(arr));
    }


    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }
}