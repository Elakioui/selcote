import TwiceAsOld.TwiceAsOld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwiceAsOldTest {

    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld.get(30, 0));
        assertEquals(16, TwiceAsOld.get(30,7));
        assertEquals(15, TwiceAsOld.get(45,30));
    }
}
