package coffee.hackerrank.pratice;

import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < 4){
                min +=arr[i];
            }
            if(i > 0){
                max += arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] input = {140638725,436257910,953274816 ,734065819,362748590};
        miniMaxSum(input);
    }
}
