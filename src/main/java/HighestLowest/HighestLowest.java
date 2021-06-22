package HighestLowest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HighestLowest {
    public static String highAndLow(String numbers) {

        String[] chrs = numbers.split(" ");

        int[] array = Stream.of(chrs)
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .toArray();

        return array[array.length - 1] + " " + array[0] ;
    }

}
