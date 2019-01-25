package coffee.hackerrank.pratice;

public class TimeConversion {


    static class Time {

        private String hour;
        private String minute;
        private String second;
        private String format;

        private static final String AM = "AM";

        public Time(String time){
            String[] arr = time.split(":");
            hour = arr[0];
            minute = arr[1];
            second = arr[2].replaceAll("\\D", "");
            format = arr[2].replaceAll("\\d","");
            convertHour();
        }

        public void convertHour(){
            if(format.equals(AM)){
                if(this.hour.equals("12")){
                    this.hour = "00";
                }
            } else {
                if(!this.hour.equals("12")){
                    hour =  String.valueOf(Integer.valueOf(hour) + 12);
                }
            }
        }

        public String convert(){
           return hour + ":" + minute + ":" + second;
        }
    }

    static String timeConversion(String s) {

        if(s == null || s.length() == 0){
            return s;
        }

        return new Time(s).convert();
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22PM"));
    }

}
