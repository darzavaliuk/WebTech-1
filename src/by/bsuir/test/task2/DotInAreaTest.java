package by.bsuir.test.task2;

import by.bsuir.task.task2.Area;
import by.bsuir.task.task2.Dot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DotInAreaTest {
    @Test
    void testDotInArea_DotInArea_1() {
        assertTrue(Area.isPointInArea(new Dot(1, 1)));
    }

    @Test
    void testDotInArea_DotNotInArea_2() {
        assertFalse(Area.isPointInArea(new Dot(-7, 0)));
    }

    @Test
    void testDotInArea_DotInArea_3() {
        assertTrue(Area.isPointInArea(new Dot(5, -1)));
    }

    @Test
    void testDotInArea_DotInArea_4() {
        assertTrue(Area.isPointInArea(new Dot(0, 0)));
    }

    @Test
    void testDotInArea_DotInArea_5() {
        assertTrue(Area.isPointInArea(new Dot(6, 0)));
    }

    @Test
    void testDotInArea_DotNotInArea_6() {
        assertFalse(Area.isPointInArea(new Dot(-1, -4)));
    }

}
