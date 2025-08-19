public class Q2220_MinimumBits {
    public int minBitFlips(int start, int goal) {
        int c = 0;
        for (int i = 0; i < 32; i++) {
            int s = start & 1;
            int g = goal & 1;
            if (s != g)
                c++;
            start = start >> 1;
            goal = goal >> 1;
        }
        return c;

    }
}
