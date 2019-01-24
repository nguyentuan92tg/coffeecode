package coffee.adventofcode;

import java.util.ArrayList;
import java.util.List;

public class Day6 {

    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 6));
        points.add( new Point(8, 3));
        points.add(new Point(3, 4));
        points.add(new Point(5, 5));
        points.add(new Point(8, 9));
        new Guesting().findCharacter(points).entrySet().stream().forEach(result -> System.out.println(" " + result));
    }
}
