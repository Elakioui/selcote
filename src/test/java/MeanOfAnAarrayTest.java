import MeanArray.MeanOfAnAarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeanOfAnAarrayTest {

    @Test
    public void simpleTest() {
        assertEquals(2, MeanOfAnAarray.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,MeanOfAnAarray.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,MeanOfAnAarray.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

}
