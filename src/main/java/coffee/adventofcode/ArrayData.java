package coffee.adventofcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayData {

    public List<Point> draw(int width, int length){
        List<Point> arrLists = new ArrayList<>();
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= length; j++) {
                arrLists.add(new Point(i, j));
            }
        }
        return arrLists;
    }
}
