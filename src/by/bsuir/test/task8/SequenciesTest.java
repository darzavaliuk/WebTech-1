package by.bsuir.test.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static by.bsuir.task.task8.MergeIndex.findMergeIndexes;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class SequenciesTest {

    @Test
    void testMergeIndexes_EmptyLists() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void testMergeIndexes_OneEmptyList() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void testMergeIndexes_NoEqualElements() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(7, 8, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(12, 13, 14));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(3, 3, 3)), result);
    }

    @Test
    void testMergeIndexes_HasEqualElements() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 4, 6, 7, 8));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(1, 2, 3, 4, 4)), result);
    }

    @Test
    void testMergeIndexes_Duplicates() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(2, 3, 4, 4, 5, 6));
        ArrayList<Integer> result = findMergeIndexes(arr1, arr2);
        assertIterableEquals(new ArrayList<Integer>(List.of(2, 4, 5, 5, 6, 6)), result);
    }
}
