package by.bsuir.task.task1;

public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula(Math.PI, Math.PI);
        formula.calculate();
        System.out.println(formula.getResult());
    }
}