package by.bsuir.task.task7;

import java.util.Arrays;

public class Main {
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(double[] arr) {
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                swap(arr, i, i + 1);
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {9, 8, 7, 6, 5, 4, 4, 3, 2, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}