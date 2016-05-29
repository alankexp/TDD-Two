import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by yuanbao on 2016/5/29.
 */
public class TennisTest {
    @Test
    public void testTennis(){
        assertEquals("Love All", Tennis.transformat(0, 0));
        assertEquals("Fifteen Love", Tennis.transformat(1, 0));
        assertEquals("Thirty Love", Tennis.transformat(2, 0));
        assertEquals("Forty Love", Tennis.transformat(3, 0));
        assertEquals("Fifteen All", Tennis.transformat(1, 1));
        assertEquals("Thirty Fifteen", Tennis.transformat(2, 1));
        assertEquals("Thirty All", Tennis.transformat(2, 2));
        assertEquals("Forty Fifteen", Tennis.transformat(3, 1));
        assertEquals("Forty Thirty", Tennis.transformat(3, 2));
        assertEquals("Deuce", Tennis.transformat(3, 3));
        assertEquals("A Win", Tennis.transformat(4, 0));
        assertEquals("A Win", Tennis.transformat(4, 1));
        assertEquals("A Win", Tennis.transformat(4, 2));
        assertEquals("A Advantage", Tennis.transformat(4, 3));
        assertEquals("A Win", Tennis.transformat(5, 3));
        assertEquals("A Win", Tennis.transformat(6, 4));

    }
}
