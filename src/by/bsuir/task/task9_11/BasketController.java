package by.bsuir.task.task9_11;

import java.awt.*;

public class BasketController {
    private final Basket basket;

    public BasketController(Basket basket) {
        this.basket = basket;
    }

    public int countBalls(Color color) {
        int amount = 0;
        for (Ball ball : this.basket.getBalls()) {
            if (ball.getColor() == color) {
                amount++;
            }
        }
        return amount;
    }

    public boolean addBall(Ball ball) {
        if (ball == null) {
            return false;
        }
        if (basket.getWeight() + ball.getWeight() <= basket.getCapacity()) {
            this.basket.getBalls().add(ball);
            this.basket.setWeight(this.basket.getWeight() + ball.getWeight());
            return true;
        } else {
            return false;
        }
    }
}