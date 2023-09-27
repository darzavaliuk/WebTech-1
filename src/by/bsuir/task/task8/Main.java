package by.bsuir.task.task8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> findMergeIndexes(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr2.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ind = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                i++;
            } else {
                ind.add(i);
                j++;
            }
        }

        while (j < arr2.size()) {
            ind.add(i);
            j++;
        }

        return ind;
    }

    public static void main(String[] args) {
        ArrayList<Integer> index = findMergeIndexes(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println(index);
    }
}
