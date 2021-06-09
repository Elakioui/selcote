package reverseWords;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String reverseWords( String str) {
        // step 1 : convert a string to an array { "I",  "like", "eating"}
        // step 2 :  reverse the array { "eating",  "like", "I"}
        // step 3 : concat the lements of the array to get a string

        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}






























