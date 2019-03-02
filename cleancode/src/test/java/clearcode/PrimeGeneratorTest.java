package clearcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeGeneratorTest {

    @Test
    public void shouldReturnEmptyArrayIfMaxNumberLessThan2() {
        final PrimeGenerator primeGenerator = new PrimeGenerator();
        Integer[] result = primeGenerator.generate(1);

        assertEquals("Primes should have empty size", 0, result.length);
    }

    @Test
    public void shouldReturnValidArrayIfMaxNumberIs9() {
        final PrimeGenerator primeGenerator = new PrimeGenerator();
        Integer[] result = primeGenerator.generate(9);

        assertArrayEquals("Primes should be right", new Integer[]{2, 3, 5, 7}, result);
    }

    @Test
    public void shouldReturnValidArrayIfMaxNumberIs7() {
        final PrimeGenerator primeGenerator = new PrimeGenerator();
        Integer[] result = primeGenerator.generate(7);

        assertArrayEquals("Primes should be right", new Integer[]{2, 3, 5, 7}, result);
    }

}
