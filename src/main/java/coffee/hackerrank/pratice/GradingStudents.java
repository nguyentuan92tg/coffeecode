package coffee.hackerrank.pratice;

public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < 38){
                result[i] = grades[i];
            } else {
                int multi = grades[i] / 5;
                if((multi + 1) * 5 - grades[i] < 3){
                    result[i] = (multi + 1)*5;
                } else {
                    result[i] = grades[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] input = {73, 67, 38, 33};
        gradingStudents(input);
    }
}
