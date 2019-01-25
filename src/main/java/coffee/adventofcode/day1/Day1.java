package coffee.adventofcode.day1;

import java.util.List;

public class Day1 {

    public int sum(List<Integer> arr){
        return arr.stream().mapToInt(Integer::valueOf).sum();
    }
}
