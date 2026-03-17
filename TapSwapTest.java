import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.assertions.assertEquals;
import static org.junit.jupiter.api.assertions.assertArrayEquals;
import static org.junit.jupiter.api.assertions.assertTrue;

public class TapSwapTest{

    @Test
    public void testTapSwapEqual(int [] numbers){
    
    int [] numbers = [5, 7, 6, 3, 2, 4];
    int [] expected = TapSwap.numberSwap(numbers);
    int [] actual = [7, 5, 3, 6, 4, 2];

    assertArraysEquals(expected, actual);



}


}
