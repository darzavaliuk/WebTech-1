package by.bsuir.test.task9;
import by.bsuir.task.task9_11.Ball;
import by.bsuir.task.task9_11.Basket;
import by.bsuir.task.task9_11.BasketController;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketControllerTest {
    @Test
    void testBasket_NullBall() {
        assertFalse(new BasketController(new Basket(10)).addBall(null));
    }

    @Test
    void testBasket_LessBasket() {
        assertFalse(new BasketController(new Basket(1)).addBall(new Ball(4, Color.BLUE)));
    }

    @Test
    void testBasket_General() {
        assertTrue(new BasketController(new Basket(10)).addBall(new Ball(10, Color.GREEN)));
    }

    @Test
    void testBasket_ZeroBalls() {
        BasketController controller = new BasketController(new Basket(22));
        controller.addBall(new Ball(1, Color.GREEN));
        controller.addBall(new Ball(2, Color.BLUE));
        controller.addBall(new Ball(3, Color.GREEN));
        controller.addBall(new Ball(13, Color.GREEN));
        assertEquals(0, controller.countBalls(Color.RED));
    }

    @Test
    void testBasket_BlackBalls() {
        BasketController controller = new BasketController(new Basket(22));
        controller.addBall(new Ball(1, Color.BLACK));
        controller.addBall(new Ball(2, Color.BLUE));
        controller.addBall(new Ball(3, Color.GREEN));
        controller.addBall(new Ball(13, Color.GREEN));
        assertEquals(3, controller.countBalls(Color.BLACK));
    }
}
