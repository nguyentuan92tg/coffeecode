package coffee.adventofcode.day4;

public class TimeStamp {

    private int minute;
    private int code;
    private String status;

    public TimeStamp(String str){


        if(str.contains("Guard")){
            status = "Guard";
            String[] arr = str.split("\\s+");
            code = Integer.valueOf(arr[3].replace("#", ""));
            //System.out.println(code);
        }

        if(str.contains("asleep")){
            status = "asleep";
            String[] arr = str.split("\\s+");
            minute = Integer.valueOf(arr[1].substring(3, 5));
            //System.out.println(minute);
        }

        if(str.contains("wakes")){
            status = "wakes";
            String[] arr = str.split("\\s+");
            minute = Integer.valueOf(arr[1].substring(3, 5));
            //System.out.println(minute);
        }
    }

    public String status(){
        return status;
    }

    public int result(){
        return minute != 0 ? minute : code;
    }
}
