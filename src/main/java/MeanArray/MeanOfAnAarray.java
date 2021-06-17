package MeanArray;

import java.util.stream.IntStream;

public class MeanOfAnAarray {
    public static int getAverage(int[] marks){

        return (int) IntStream.of(marks)
                .average()
                .stream()
                .map(Math::floor)
                .findFirst()
                .getAsDouble();
    }
}
