package by.bsuir.task.task4;

import java.util.ArrayList;

public class PrimesFinder {
    private static ArrayList<Integer> result;
    public ArrayList<Integer> getResult() {
        return result;
    }

    public static ArrayList<Integer> findIndexesOfPrimeNums(ArrayList<Integer> nums) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (isPrime(nums.get(i))) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
