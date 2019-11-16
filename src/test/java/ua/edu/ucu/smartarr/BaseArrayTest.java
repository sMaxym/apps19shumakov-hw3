package ua.edu.ucu.smartarr;

import org.junit.Test;
import static org.junit.Assert.*;

class BaseArrayTest {
    @Test
    void testRemoveAt() {
        Object[] ar = {-3, 2, 1, 2};
        Object[] ex = {-3, 2, 2};
        SmartArray sa = new BaseArray(ar);
        sa.removeAt(2);
        assertArrayEquals(ex, sa.toArray());
    }
}
