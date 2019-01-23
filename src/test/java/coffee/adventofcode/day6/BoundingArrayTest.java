package coffee.adventofcode.day6;

import coffee.adventofcode.BoundingArray;
import org.junit.Test;

public class BoundingArrayTest {

    BoundingArray boundingArray = new BoundingArray();

    @Test
    public void countArr(){
        System.out.println(boundingArray.bound(2,2));
    }

}
