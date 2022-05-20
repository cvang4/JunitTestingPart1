/**
 * This is testing the AverageMethod in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.AverageMethod;

public class AverageMethodTest {

    int expectedResult = (int) 3;

    @Test

    //Testing to make sure sums method is adding up correctly
    public void testAverages() {
        assertEquals((int)expectedResult, AverageMethod.sums(1,1,1));
    }

}
