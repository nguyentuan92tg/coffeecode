package coffee.adventofcode.day6;


import java.util.ArrayList;
import java.util.List;

public class BoundingArray {

    public List<Point> bound(int x, int y){
        List<Point> boundPoints = new ArrayList<>();
        for (int i = 0; i <= x; i++) {
            boundPoints.add(new Point(i, 0));
            boundPoints.add(new Point(i, y));
        }

        for (int i = 0; i <= y; i++) {
            boundPoints.add(new Point(x, i));
            boundPoints.add(new Point(0, i));
        }
        return boundPoints;
    }
}
