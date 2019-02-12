package coffee.adventofcode.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day4 {

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("C:/Users/nhtuan/Desktop/tuan.txt"));

        for (int i = 0; i < list.size(); i++) {
            new Time(list.get(i));
        }

        System.out.println(Time.minuteMap.get(10).minute);
        System.out.println(Time.minuteMap.get(10).time);
        System.out.println("---->");
        System.out.println(Time.minuteMap.get(99).minute);
        System.out.println(Time.minuteMap.get(99).time);
    }
}
