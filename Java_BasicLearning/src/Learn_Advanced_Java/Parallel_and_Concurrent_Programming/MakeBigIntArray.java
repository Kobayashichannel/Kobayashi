package Learn_Advanced_Java.Parallel_and_Concurrent_Programming;

import java.math.BigInteger;

public class MakeBigIntArray {
    private final BigInteger[] list;

    public MakeBigIntArray(int bounds) {
        list = new BigInteger[bounds];
        for (int i = 0; i < bounds; i++) {
            list[i] = new BigInteger("" + (i + 1));
        }
    }

    public BigInteger[] getList() {
        return list;
    }
}
