package coffee.hackerrank.pratice;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

    static class Score {

         int min;
         int max;

        public Score(int min, int max){
            this.min = min;
            this.max = max;

            if(min > max){
                int temp =  min;
                this.min = max;
                this.max = temp;
            }
        }
    }

    static class Scores {

        private List<Score> scoreList = new ArrayList<>();

        public Scores(int[] scores){
            scoreList.add(new Score(scores[0], scores[0]));
            for (int i = 1; i < scores.length; i++) {

                scoreList.add(new Score(scores[i -1], scores[i]));
            }
        }

        private int[] count(){

            int countHigh = 0, countLow = 0;
            int pointHigh = scoreList.get(0).max;
            int pointLow = scoreList.get(0).min;

            for (int i = 1; i < scoreList.size(); i++) {
                if(scoreList.get(i).max > pointHigh){
                    countHigh++;
                    pointHigh = scoreList.get(i).max;
                }
                if(pointLow > scoreList.get(i).min){
                    countLow++;
                    pointLow = scoreList.get(i).min;
                }
            }
            int[] result = new int[2];
            result[0] = countHigh;
            result[1] = countLow;
            return result;
        }
    }

    static int[] breakingRecords(int[] scores) {

        return new Scores(scores).count();
    }

    public static void main(String[] args) {
        int[] input = {10,5,20,20,4,5,2,25,1};
        System.out.println(breakingRecords(input));
    }
}
