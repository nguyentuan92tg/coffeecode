package coffee.adventofcode;

import java.util.*;

public class Guesting {

    private static Map<Integer, Character> map = new HashMap<>();

    static {
        map.put(0, 'A');
        map.put(1, 'B');
        map.put(2, 'C');
        map.put(3, 'D');
        map.put(4, 'E');
        map.put(5, 'F');
    }

    private Set<Character> skips = new HashSet<>();

    public Map<Character, Integer> findCharacter(List<Point> inputs){
        Character result;
        Map<Character, Integer> map = new HashMap<>();

        Points p = new Points(inputs);
        List<Point> points = new ArrayData().draw(p.findMaxWidth(), p.findMaxWeight());

        for (int i = 0; i < points.size(); i++) {
             result = find(inputs, points.get(i));
             if(result != null ){
                 if (map.get(result) != null){
                     map.put(result, map.get(result) + 1);
                 } else {
                     map.put(result, 1);
                 }
             }
        }
        return map;
    }

    public Character find(List<Point> points, Point currentPoint){

        List<Point> reList = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            int result  = Math.abs(point.getX() - currentPoint.getX()) + Math.abs(point.getY() - currentPoint.getY());
            reList.add(new Point(i, result));
        }

        reList.sort(Comparator.comparingInt(Point::getY));

        if (reList.get(1) ==  reList.get(2)){
            return null;
        }

        Points p = new Points(points);

        if(new BoundingArray().bound(p.findMaxWeight(), p.findMaxWeight()).contains(currentPoint)){
            skips.add(map.get(reList.get(0).getX()));
            return  null;
        }
        if(skips.contains(map.get(reList.get(0).getX()))){
            return null;
        }
        return  map.get(reList.get(0).getX());
    }
}
