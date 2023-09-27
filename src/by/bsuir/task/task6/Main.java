package by.bsuir.task.task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = Matrix.createMatrix(new double[]{1});
        for (double[] doubles : matrix) {
            System.out.println(Arrays.toString(doubles));
        }
    }
}
