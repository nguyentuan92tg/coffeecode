package coffee.adventofcode.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day3 {


  /*  private int count = 0;

    boolean flag = false;


    public int guestAll() {
        try {
            List<String> arr = Files.lines(Paths.get("C:/Users/nhtuan/Desktop/tuan.txt")).collect(Collectors.toList());

            for (int i = 0; i < arr.size(); i++) {
                Set<Point> points = getQuiz(arr.get(i));
                guestAll(arr, i).stream().forEach(p -> {
                    if(points.contains(p)){
                        flag = true;
                        return;
                    }
                });
                if (flag == true){

                } else{
                    System.out.println(points.stream().findFirst().map(Point::getKey).get());
                }
                flag = false;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }*/


  /*  public Set<Point> guestAll(List<String> arr, int skip) {
        Set<Point> allArrays = new HashSet<>(1000);

        for (int i = 0; i < arr.size(); i++) {
            if (i != skip) {
                Set<Point> points = getQuiz(arr.get(i));
                allArrays.addAll(points);
            }
        }

        return allArrays;

    }*/

    private Set<Point> allPoints = new HashSet<>(1000);

    private Set<Point> result = new HashSet<>(1000);


    public void checkAll() throws IOException {
        Files.lines(Paths.get("C:/Users/nhtuan/Desktop/input.txt")).forEach(str -> check(str));

        System.out.println(result.size());
    }

    public void check(String str){
        Set<Point> points =  getQuiz(str);

        points.forEach( p -> {
            if(!allPoints.isEmpty() && allPoints.contains(p)){
                result.add(p);
            }
        });

        allPoints.addAll(points);

    }


    public Set<Point> getQuiz(String request) {
        String[] result = request.replaceAll("\\D", " ").trim().split("\\s+");
        String name = result[0];
        int farFromX = Integer.parseInt(result[1]);
        int farFromY = Integer.parseInt(result[2]);
        int coorX = Integer.parseInt(result[3]);
        int coorY = Integer.parseInt(result[4]);

        Set<Point> points = new HashSet<>();
        for (int i = 0; i < coorY; i++) {
            for (int j = 0; j < coorX; j++) {
                Point point = new Point(j + farFromX, i + farFromY, Integer.valueOf(result[0]));
                points.add(point);
            }
        }

        return points;
    }

    public static void main(String[] args) throws IOException {

        new Day3().checkAll();
    }


}
