package by.bsuir.task.task2;

public class Area {
    private static boolean check(int x, int y) {
        return checkBottomFigure(x, y) || checkTopFigure(x, y);
    }

    private static boolean checkBottomFigure(int x, int y) {
        return (x >= -6 && x <= 6) && (y >= -3 && y <= 0);
    }

    private static boolean checkTopFigure(int x, int y) {
        return (x >= -4 && x <= 4) && (y >= 0 && y <= 5);
    }

    public static boolean isPointInArea(Dot dot) {
        int x = dot.getX();
        int y = dot.getY();
        return check(x, y);
    }
}
