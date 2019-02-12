package coffee.adventofcode.day4;

import java.util.HashMap;
import java.util.Map;

public class Time {



    static Map<Integer, Duration> minuteMap = new HashMap<>();

    public Time(String str){
        int code;
        String[] arr = str.split("\\s+");
        code = Integer.valueOf(arr[1].replace("#", ""));
        String minuteStr = arr[2];
        int start = 0;
        int end = 0;
        int total = 0;
        for (int i = 0; i < minuteStr.length(); i++) {
            if(minuteStr.charAt(i) == '#'){
                if(minuteStr.charAt(i - 1) == '.') {
                    start = i;
                    end = 0;
                }
                if(minuteStr.charAt(i + 1) == '.'){
                    end = i;
                    total += new Minute(start, end).getDuration();
                    end = 0;
                }
            }
        }
        if(minuteMap.get(code) == null){
            minuteMap.put(code, new Duration(1, total));
        } else {
            int time = minuteMap.get(code).time + 1;
            minuteMap.put(code, new Duration( time, total+minuteMap.get(code).minute));
        }
    }

    class Duration {
        int time;
        int minute;

        public Duration(int time, int minute){
            this.time = time;
            this.minute = minute;
        }


    }

     class Minute {

        private int duration;

        public Minute(int start, int end){
            this.duration = end - start + 1;
        }

        public int getDuration(){
            return this.duration;
        }

    }
}
