package coffee.adventofcode.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Day6 {

    public static void main(String[] args) throws IOException {

        List<Point> points = buildArray();


        new Guesting().findCharacter(points).entrySet().stream().forEach(result -> System.out.println(" " + result));
    }


    public static List<Point> buildArray() throws IOException {
        List<Point> points = new ArrayList<>();
        Files.lines(Paths.get("C:/Users/nhtuan/Desktop/test.txt")).forEach(str -> {
            String[] arr = str.split(", ");
            points.add(new Point(Integer.valueOf(arr[0]), Integer.valueOf(arr[1])));
        });
        return points;
    }
}
