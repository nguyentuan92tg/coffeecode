package coffee.adventofcode;

import java.util.Comparator;
import java.util.List;

public class Points {

    private List<Point> points;

    public Points(List<Point> points){
        this.points =  points;
    }

    public int findMaxWidth(){
        return points.stream().map(Point::getX).mapToInt(v->v).max().getAsInt();
    }

    public int findMaxWeight(){
        return points.stream().map(Point::getY).mapToInt(v->v).max().getAsInt();
    }
}
