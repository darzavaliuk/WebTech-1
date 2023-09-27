package by.bsuir.task.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 8, 9, 15, 25));
        System.out.println(PrimesFinder.findIndexesOfPrimeNums(arr));
    }
}
