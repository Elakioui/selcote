import FindtheSquares.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequareTest {
    @Test
    public void testBasicNumbers() {
        assertEquals("25-16",Square.findtheSquares(9));
    }
    @Test
    public void testSmallerNumbers() {
        assertEquals("1-0",Square.findtheSquares(1));
    }
    @Test
    public void testBiggerNumbers() {
        assertEquals("891136-889249", Square.findtheSquares(1887));
        assertEquals("2499600016-2499500025",Square.findtheSquares(99991));
    }
}
