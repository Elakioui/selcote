package SortArray;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class SortArray {
    public static int[] sortArray(int[] array) {
        // step 1 : retreive an array of even numbers
        // step 2 : sort the array extracted
        // step 3: create another array where you mix the sorted odd numbers and the even numbers


        int[] evenNumbersSorted =  IntStream.of(array)
                .filter( number -> number % 2 != 0)
                .sorted()
                .toArray();

        int j = 0;
        for (int i = 0; i < array.length; i++)

            if( array[i] % 2 != 0) {
                array[i] = evenNumbersSorted[j];
                j++;
            }

        return array;
    }

    public static int[] sortArrayV2(int[] array) {
        PrimitiveIterator.OfInt sortedOdds = IntStream
                .of(array)
                .filter(i -> i % 2 == 1)
                .sorted()
                .iterator();

        return IntStream
                .of(array)
                .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
                .toArray();
    }

    public static void main(String[] args) {
        SortArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
    }
}
