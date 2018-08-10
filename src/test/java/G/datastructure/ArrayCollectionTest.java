package G.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollectionTest {
    @Test
    public void testsizeZero(){
        ArrayCollection ArrayA = new ArrayCollection();
        assertEquals( expected: 0 ,ArrayA.size());
    }
}
