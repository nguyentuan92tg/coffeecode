package coffee.adventofcode.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day2 {

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("C:/Users/nhtuan/Desktop/input.txt"));

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Checking checking = new Checking(list.get(i), list.get(j));
            }
        }
    }
}
