package clearcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrimeGenerator {

    private Boolean[] crossedOut;
    private int maxNumber;

    public Integer[] generate(int maxNumber) {
        this.maxNumber = maxNumber;

        if (maxNumber < 2) {
            return new Integer[0];
        }

        prepareSieve();

        crossOut();

        return getPrimes();
    }

    private void prepareSieve() {
        this.crossedOut = Stream.generate(() -> false).limit(maxNumber + 1).toArray(Boolean[]::new);
    }

    private void crossOut() {
        for (int i = 2; i <= maxNumber; i++) {
            if (isNotCrossedOut(i)) {
                crossOut(i);
            }
        }
    }

    private void crossOut(int prime) {
        for (int i = 2; i * prime <= maxNumber; i++) {
            crossedOut[i * prime] = true;
        }
    }

    private boolean isNotCrossedOut(int i) {
        return !crossedOut[i];
    }

    private Integer[] getPrimes() {
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i <= maxNumber; i++) {
            if (isNotCrossedOut(i)) {
                result.add(i);
            }
        }

        return result.toArray(new Integer[result.size()]);
    }

}
