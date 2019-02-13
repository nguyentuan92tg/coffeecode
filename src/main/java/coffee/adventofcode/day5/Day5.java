package coffee.adventofcode.day5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.Collections.*;

public class Day5 {

    static Map<Integer, String> converter = new HashMap<>();

    static {
        converter.put(0, "A|a");
        converter.put(1, "B|b");
        converter.put(2, "C|c");
        converter.put(3, "D|d");
        converter.put(4, "E|e");
        converter.put(5, "F|f");
        converter.put(6, "G|g");
        converter.put(7, "H|h");
        converter.put(8, "K|k");
        converter.put(9, "L|l");
        converter.put(10, "M|m");
        converter.put(11, "N|n");
        converter.put(12, "O|o");
        converter.put(13, "P|p");
        converter.put(14, "Q|q");
        converter.put(15, "R|r");
        converter.put(16, "S|s");
        converter.put(17, "T|t");
        converter.put(18, "U|u");
        converter.put(19, "V|v");
        converter.put(20, "W|w");
        converter.put(21, "X|x");
        converter.put(22, "Y|y");
        converter.put(23, "z|z");
        converter.put(24, "I|i");
        converter.put(25, "J|j");
    }

    static List<Integer> resSet = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        String str = Files.readAllLines(Paths.get("C:/Users/nhtuan/Desktop/tuan.txt")).get(0);

        for (int i = 0; i <= 25; i++) {
            String newString = new String(str);
            newString = newString.replaceAll(converter.get(i), "");

            resSet.add(find(newString));
        }

        resSet.stream().sorted().forEach(result -> {
            System.out.println(result);
        });

    }

    public static int find(String str) {
        String newStr = null;
        int i = 0;
        while (i < str.length() - 1) {
            if (Character.isUpperCase(str.charAt(i))) {
                if (str.charAt(i + 1) == Character.toLowerCase(str.charAt(i))) {
                    String replace = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
                    str = str.replace(replace, "");
                }

            } else {
                if (Character.isLowerCase(str.charAt(i))) {
                    if (str.charAt(i + 1) == Character.toUpperCase(str.charAt(i))) {
                        String replace = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
                        str = str.replace(replace, "");
                    }
                }
            }
            if (i == str.length() - 2) {
                if (newStr != null && newStr.length() == str.length()) {

                   return str.length();
                }
                newStr = new String(str);
                i = 0;
            } else {
                i++;
            }
        }
        return 0;
    }

}
