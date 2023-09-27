package by.bsuir.test.task7;

import by.bsuir.task.task7.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    void testSort_EmptyArray() {
        double[] arr = {};
        double[] expected = {};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void testSort_OneElementArr() {
        double[] arr = {1};
        double[] expected = {1};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void testSort_Sorted() {
        double[] arr = {1, 2, 3, 4, 5};
        double[] expected = {1, 2, 3, 4, 5};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }

    @Test
    void testSort_Unsorted() {
        double[] arr = {7, 6, 5, 4, 1, 2, 5, 9, 8};
        double[] expected = {1, 2, 4, 5, 5, 6, 7, 8, 9};
        Main.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 1E-6);
        }
    }
}
