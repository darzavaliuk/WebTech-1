package by.bsuir.task.task7;

import java.util.Arrays;

import static by.bsuir.task.task7.Sort.sort;

public class Main {
    public static void main(String[] args) {
        double[] arr = {9, 8, 7, 6, 5, 4, 4, 3, 2, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}