package by.bsuir.test.task6;
import org.junit.jupiter.api.Test;

import static by.bsuir.task.task6.Matrix.createMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    void testMatrix_EmptyArray() {
        double[] arr = {};
        double[][] expected = {};
        double[][] actual = createMatrix(arr);
        assertMatrices(expected, actual);
    }

    @Test
    void testMatrix_SimArray() {
        double[] arr = {1};
        double[][] expected = {
                {1}
        };
        double[][] actual = createMatrix(arr);
        assertMatrices(expected, actual);
    }

    @Test
    void testMatrix_checkOnTwoElemArr() {
        double[] arr = {1, 1};
        double[][] expected = {
                {1, 1},
                {1, 1}
        };
        double[][] actual = createMatrix(arr);
        assertMatrices(expected, actual);
    }

    private void assertMatrices(double[][] expected, double[][] actual) {
        assertEquals(expected.length, actual.length);
        if (expected.length != 0 && actual.length != 0) {
            assertEquals(expected[0].length, actual[0].length);
            for (int i = 0; i < expected.length; i++) {
                assertArrayEquals(expected[i], actual[i]);
            }
        }
    }

}
