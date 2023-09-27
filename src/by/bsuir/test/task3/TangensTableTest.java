package by.bsuir.test.task3;

import by.bsuir.task.task3.TangensTable;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TangensTableTest {
    @Test
    void testTangensTable_Step1() {
        TangensTable tangensTable = new TangensTable(1, 2, 1);
        tangensTable.calculate();
        List<Double> testResults = List.of(1.5574, -2.1850);
        assertResultsAreClose(testResults, tangensTable.getResult());
    }

    @Test
    void testTangensTable_Step05() {
        TangensTable tangensTable = new TangensTable(-2, 1, 0.5);
        tangensTable.calculate();
        List<Double> testResults = List.of(2.1850, -14.1014, -1.5574, -0.5463, 0.0, 0.5463, 1.5574);
        assertResultsAreClose(testResults, tangensTable.getResult());
    }

    @Test
    void testTangensTable_OneElement() {
        TangensTable tangensTable = new TangensTable(0, 0, 1);
        tangensTable.calculate();
        List<Double> testResults = List.of(0.0);
        assertResultsAreClose(testResults, tangensTable.getResult());
    }

    @Test
    void testTangensTable_BigInterval() {
        TangensTable tangensTable = new TangensTable(-1, 1, 4);
        tangensTable.calculate();
        List<Double> testResults = List.of(-1.5574);
        assertResultsAreClose(testResults, tangensTable.getResult());
    }

    private void assertResultsAreClose(List<Double> expected, List<Double> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i), 0.0001);
        }
    }
}
