import HighestLowest.HighestLowest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestLowestTest {

    @Test
    public void test1() {
        assertEquals("42 -9", HighestLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
