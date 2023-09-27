package by.bsuir.task.task9_11;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private int weight;
    private ArrayList<Ball> balls;

    public Basket() {
        this.capacity = 0;
        balls = new ArrayList<>();
    }

    public Basket(int capacity) {
        this.capacity = capacity;
        balls = new ArrayList<>(this.capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int currWeight) {
        this.weight = currWeight;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}
