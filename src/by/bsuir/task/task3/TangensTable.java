package by.bsuir.task.task3;

import java.util.ArrayList;

public class TangensTable {
    private double start;
    private double end;
    private double interval;
    private ArrayList<Double> result;

    public TangensTable(double start, double end, double interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public double getInterval() {
        return interval;
    }

    public ArrayList<Double> getResult() {
        return result;
    }

    public void calculate() {
        if (result == null) {
            result = new ArrayList<>();
        }
        while (end + interval / 2.0 > start + result.size() * interval) {
            result.add(Math.tan(interval * result.size() + start));
        }
    }

    public String getTable() {
        StringBuilder str = new StringBuilder();
        String header = "| %-5s | %-5s |\n";
        String row = "| %-5.5f | %-5.5f |\n";
        str.append("________________________________\n");
        str.append(String.format(header, "angle", "tg(angle)"));

        for (int i = 0; i < result.size(); i++) {
            str.append("________________________________\n");
            str.append(String.format(row, start + interval * i, result.get(i)));
        }

        str.append("___________________________\n");

        return str.toString();
    }

}
