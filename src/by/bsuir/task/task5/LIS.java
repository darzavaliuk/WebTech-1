package by.bsuir.task.task5;

import java.util.Arrays;

public class LIS {
    public static int minDeletions(int[] arr) {
        if (arr.length < 1)
            return 0;
        int[] maxSubs = new int[arr.length];
        Arrays.fill(maxSubs, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    maxSubs[i] = Math.max(maxSubs[i], maxSubs[j] + 1);
                }
            }
        }

        return arr.length - Arrays.stream(maxSubs).max().getAsInt();
    }
}
