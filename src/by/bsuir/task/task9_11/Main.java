package by.bsuir.task.task9_11;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BasketController controller = new BasketController(new Basket(100));
        controller.addBall(new Ball(1, Color.RED));
        controller.addBall(new Ball(24, Color.BLUE));
        System.out.println(controller.countBalls(Color.BLUE));
    }
}
