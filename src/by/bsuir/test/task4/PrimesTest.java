package by.bsuir.test.task4;

import java.util.ArrayList;
import java.util.List;

import static by.bsuir.task.task4.PrimesFinder.findIndexesOfPrimeNums;
import static by.bsuir.task.task4.PrimesFinder.isPrime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimesTest {

    @Test
    void testIsPrime_NotPrimeNumbers() {
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
        assertFalse(isPrime(4));
        assertFalse(isPrime(8));
        assertFalse(isPrime(15));
    }

    @Test
    void testIsPrime_PrimeNumbers() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(5));
        assertTrue(isPrime(7));
        assertTrue(isPrime(11));
        assertTrue(isPrime(13));
    }

    @Test
    void testFindIndexesOfPrimes_EmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = findIndexesOfPrimeNums(numbers);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesOfPrimes_ZeroPrimes() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 6, 8, 9, 15, 25));
        ArrayList<Integer> result = findIndexesOfPrimeNums(numbers);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesOfPrimes_AllPrimes() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13));
        ArrayList<Integer> result = findIndexesOfPrimeNums(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesOfPrimes_General() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 4, 7, 8, 11, 12, 17));
        ArrayList<Integer> result = findIndexesOfPrimeNums(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(2, 4, 6));
        assertEquals(expected, result);
    }

    @Test
    void testFindIndexesOfPrimes_OnePrime() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(4, 6, 8, 13, 15, 25));
        ArrayList<Integer> result = findIndexesOfPrimeNums(numbers);
        ArrayList<Integer> expected = new ArrayList<>(List.of(3));
        assertEquals(expected, result);
    }

    @Test
    void testIsPrime_NegativeNumber() {
        assertFalse(isPrime(-1));
        assertFalse(isPrime(-10));
        assertFalse(isPrime(Integer.MIN_VALUE));
    }
    
}
