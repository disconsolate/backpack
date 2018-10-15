package ir.hossein_shemshadi.random;

public class Random {
    public static Long[] divideRandomly(long number, int count) {
        Long[] dividends = new Long[count];
        long remained = number;
        for (int i = 0; i < count - 1; i++) {
            long temp = (long) (Math.random() * remained);
            while (temp == 0 || temp >= 0.5 * remained) {
                temp = (long) (Math.random() * remained);
            }
            dividends[i] = temp;
            remained -= temp;
        }
        dividends[count - 1] = remained;
        return dividends;
    }
}
