package by.bsuir.task.task7;

public class Sort {
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(double[] arr) {
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                swap(arr, i, i + 1);
                if (i > 0) {
                    i--;
                }
            }
        }
    }

}
