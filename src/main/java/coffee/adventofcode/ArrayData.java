package coffee.adventofcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayData {

    private List<Point> arrLists = new ArrayList<>();

    public List<Point> build(int width, int length){
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= length; j++) {
                arrLists.add(new Point(i, j));
            }
        }
        return arrLists;
    }


}
