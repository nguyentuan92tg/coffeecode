package coffee.adventofcode;

import java.util.List;

public class Day6 {

    public static void main(String[] args) {

        List<Point> points = List.of(new Point(1, 1),
                new Point(1, 6), new Point(8, 3),
                new Point(3, 4), new Point(5, 5), new Point(8, 9));
        new Guesting().result(points);
    }
}
