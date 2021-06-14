package FindtheSquares;

public class Square {

    public static String findtheSquares(int n){

        if ( n <= 0 || n >= 1000000) return "-1";

        long max  = (long) Math.pow((n / 2) + 1, 2);
        long min = (long) Math.pow(n / 2, 2);

        return max + "-" + min;
    }
}
