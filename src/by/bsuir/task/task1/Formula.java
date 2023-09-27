package by.bsuir.task.task1;

public class Formula {
    private double x;
    private double y;
    private double result;

    public Formula(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void calculate() {
        result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)))) + x;
    }
}