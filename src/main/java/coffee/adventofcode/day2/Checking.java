package coffee.adventofcode.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Checking {

    boolean stop = false;


    public Checking(String str1, String str2){
        if (str1.length() != str2.length())
            return;
        int differences = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))
                if(++differences > 1)
                   return;
        }

        if(differences == 1){
            System.out.println(str1);
            System.out.println(str2);
        }
    }

    public boolean isStop(){
        return stop;
    }
}
