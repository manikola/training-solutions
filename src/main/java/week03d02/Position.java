package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position: " + name + ",  " + bonus + "Ft ";
    }

    public static void main(String[] args) {
        List<Position> list = new ArrayList<>();
        Position p1 = new Position("Jason",  100_000);
        Position p2 = new Position("John",  160_000);
        Position p3 = new Position("James",  200_000);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Position item : list) {
            if (item.getBonus() > 150_000) {
                System.out.println(item.toString());
            }
        }
    }
}
