package by.bsuir.task.task8;

import java.util.ArrayList;
import java.util.Arrays;

import static by.bsuir.task.task8.MergeIndex.findMergeIndexes;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> index = findMergeIndexes(new ArrayList<>(Arrays.asList(0)),
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println(index);
    }
}
