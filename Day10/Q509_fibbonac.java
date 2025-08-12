package Day10;

public class Q509_fibbonac {
    public int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

}
