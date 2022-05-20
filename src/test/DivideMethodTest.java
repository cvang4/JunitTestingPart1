package test;
/**
 * This is testing the DivideMethod in the Main folder
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import main.DivideMethod;

public class DivideMethodTest {
    
    float expectedResult = 3f;

    @Test

    //Tests to make sure divide method works
    public void testDivideMethod() {
        assertEquals((float)expectedResult, DivideMethod.divide(9f, 3f));
    }
}
