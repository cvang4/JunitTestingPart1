/**
 * This is testing the Math in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Math;

public class MathTest {

    @Test

    //This tests to make sure string is returned from Hello method.
    public void testHello() {
        assertEquals("This is how math looks!", Math.hello());
    }

    @Test

    // Testing to make sure subtraction method works.
    public void testSubtraction() {
        assertEquals(1, Math.subtraction(2, 1));
    }

    @Test

    //Test to make sure addition method works.
    public void testAdding() {
        assertEquals(5, Math.adding(3, 2));
    }

    @Test

    //Test to make sure Bye method returns
    public void testBye() {
        assertEquals("This is how subtraction looks like!", Math.bye());
    }
}
