import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yuanbao on 2016/5/29.
 */
public class CaculationTest {
    @Test
    public void test(){
        assertEquals(Arrays.asList(2), Caculation.calc(2));
        assertEquals(Arrays.asList(3), Caculation.calc(3));
        assertEquals(Arrays.asList(2,2), Caculation.calc(4));
        assertEquals(Arrays.asList(5), Caculation.calc(5));
        assertEquals(Arrays.asList(2,3), Caculation.calc(6));
        assertEquals(Arrays.asList(7), Caculation.calc(7));
        assertEquals(Arrays.asList(2,2,2), Caculation.calc(8));
        assertEquals(Arrays.asList(3,3), Caculation.calc(9));
        assertEquals(Arrays.asList(2,2,5,5), Caculation.calc(100));
        assertEquals(Arrays.asList(2,3,5,7,11,13), Caculation.calc(2*3*5*7*11*13));

    }
}
