package coffee.adventofcode.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Day4 {


    static class Duration {
        private int time;
        private int minute;

        public Duration(int time, int minute) {
            this.minute = minute;
            this.time = time;
        }

        public int getTime() {
            return time;
        }

        public int getMinute() {
            return minute;
        }

        public int result(){
            return (minute - time)/time;
        }
    }

    static Map<Integer, Duration> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("C:/Users/nhtuan/Desktop/tuan.txt"));

        int code = 0;

        int start = 0;
        int end = 0;
        boolean isChanged;
        int oldCode = 0;
        int total = 0;
        for (int i = 0; i < list.size(); i++) {

            TimeStamp timeStamp = new TimeStamp(list.get(i));
            if (timeStamp.status().equals("Guard")) {
                code = timeStamp.result();
            }

            if (timeStamp.status().equals("asleep")) {
                start = timeStamp.result();
            }
            if (timeStamp.status().equals("wakes")) {

                end = timeStamp.result();
                total = end - start;

                if(oldCode ==  code){
                    Duration duration = map.get(code);
                    if(duration ==  null){
                        map.put(code, new Duration(1, total));
                    } else {
                        map.put(code, new Duration(duration.getTime(), total + duration.getMinute()));
                    }

                } else {
                    Duration duration = map.get(code);
                    if(duration != null){
                        map.put(code, new Duration(duration.getTime() + 1, total + duration.getMinute()));
                    } else {
                        map.put(code, new Duration(1, total));
                    }
                }
                oldCode = code;
            }
            Duration duration = map.get(code);


        }

        int max = 0;
        Duration duration = null;
        int key = 0;

        Set<Map.Entry<Integer, Duration>> entries = map.entrySet();


        for (Map.Entry<Integer, Duration> entry : entries) {
            if (entry.getValue().minute > max) {
                max = entry.getValue().minute;
                duration = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(duration.result() + key);


    }
}
