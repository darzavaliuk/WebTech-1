package by.bsuir.test.task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static by.bsuir.task.task5.LIS.minDeletions;

public class LISTest {
    @Test
    void testMinDeletions_EmptyArray() {
        int[] arr = {};
        int result = minDeletions(arr);
        System.out.println(minDeletions(arr));
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMinDeletions_OneElement() {
        int[] arr = {5};
        int result = minDeletions(arr);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMinDeletions_AllDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        int result = minDeletions(arr);
        Assertions.assertEquals(4, result);
    }

    @Test
    void testMinDeletions_AllIncreasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = minDeletions(arr);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMinDeletions_MixedSequence() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int result = minDeletions(arr);
        Assertions.assertEquals(3, result);
    }
}
