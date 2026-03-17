import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class DoubleArrayTest {

    @Test
    public void testDoubleArray() {

        int[] input = {2, 6, 7, 1, 5};

        int[] expected = {2, 6, 7, 1, 5, 4, 12, 14, 2, 10};

        int[] result = DoubleArray.doubleArray(input);

        assertArrayEquals(expected, result);
 }
}
