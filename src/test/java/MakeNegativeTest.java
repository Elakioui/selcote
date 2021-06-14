import makeNegative.MakeNegative;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, MakeNegative.get(42));
    }
}
