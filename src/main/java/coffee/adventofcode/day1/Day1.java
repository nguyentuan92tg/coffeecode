package coffee.adventofcode.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Day1 {

    static Map<Integer, Integer> counts = new HashMap<>(2000);

   static int start = 0;

   static boolean stop = false;



    public static void findDuplicate(Integer number){

        int frequent = number + start;

        start = frequent;


       if(counts.get(frequent) != null){
           System.out.println(frequent);
           stop = true;
       }
       counts.put(frequent, 1);
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:/Users/nhtuan/Desktop/tuan.txt"));

        int start = 0;
       while (start < lines.size()){
           findDuplicate(Integer.valueOf(lines.get(start)));

           if(start == lines.size() -1){
               start = 0;
           } else{
               start++;
           }
           if(stop == true){
               break;
           }

       }
    }
}
