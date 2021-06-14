package makeNegative;

import static java.lang.Math.abs;

public class MakeNegative {
    public static int get(final int x) {
        return x <= 0 ? x : -x;
    }

    public static int getUsingAbs( final int x) {
        return abs(x);
    }

}
