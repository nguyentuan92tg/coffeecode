package coffee.adventofcode.day3;

import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Day3 {

    public static void main(String[] args) {
        int[] input = {7,69,2,221,8974};
        miniMaxSum(input);

    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int min = 0, max = 0;
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

    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j >=  n - i - 1){
                    System.out.print("#");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void plusMinus(int[] arr) {

        double length = arr.length;
        double pos =0, neg = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] > 0){
                pos++;
            }
            if(arr[i] < 0){
                neg++;
            }
        }
        DecimalFormat _numberFormat= new DecimalFormat("#0.000000");
        System.out.println(_numberFormat.format( pos/length));
        System.out.println(_numberFormat.format( neg/length));
        System.out.println(_numberFormat.format( zero/length));

    }


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();

        int result1 = 0;
        int result2 = 0;

        for(int i = 0; i < a.size(); i ++){
            if(a.get(i) > b.get(i)){
                result1++;
            }
            else if(a.get(i) < b.get(i)){
                result2++;
            }
            else {
               result1++;
               result2++;
            }
        }
        result.add(result1);
        result.add(result2);
        return result;
    }
}
