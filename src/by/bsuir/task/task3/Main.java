package by.bsuir.task.task3;

public class Main {
    public static void main(String[] args) {
        TangensTable table = new TangensTable(-2, 2, 0.5);
        table.calculate();
        System.out.println(table.getTable());
    }
}
