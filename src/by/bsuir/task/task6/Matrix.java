package by.bsuir.task.task6;

public class Matrix {

    public static double[][] createMatrix(double[] arr) {
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(j + i) % arr.length];
            }
        }
        return matrix;
    }

}
