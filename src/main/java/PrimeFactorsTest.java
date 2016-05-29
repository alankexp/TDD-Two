import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yuanbao on 2016/5/29.
 */
public class PrimeFactorsTest {
    @Test
    public void test(){
        assertEquals(Arrays.asList(2), PrimeFactors.calc(2));
        assertEquals(Arrays.asList(3), PrimeFactors.calc(3));
        assertEquals(Arrays.asList(2,2), PrimeFactors.calc(4));
        assertEquals(Arrays.asList(5), PrimeFactors.calc(5));
        assertEquals(Arrays.asList(2,3), PrimeFactors.calc(6));
        assertEquals(Arrays.asList(7), PrimeFactors.calc(7));
        assertEquals(Arrays.asList(2,2,2), PrimeFactors.calc(8));
        assertEquals(Arrays.asList(3,3), PrimeFactors.calc(9));
        assertEquals(Arrays.asList(2,2,5,5), PrimeFactors.calc(100));
        assertEquals(Arrays.asList(2,3,5,7,11,13), PrimeFactors.calc(2 * 3 * 5 * 7 * 11 * 13));

    }
}
