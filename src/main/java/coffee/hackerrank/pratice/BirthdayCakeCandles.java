package coffee.hackerrank.pratice;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        if (ar == null || ar.length == 0) {
            return 0;
        }
        int count = 0;
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == max) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] inputs = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        System.out.println(birthdayCakeCandles(inputs));
    }

}
