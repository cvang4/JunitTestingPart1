/**
 * This is testing the Customer in the Main folder
 */

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import main.Customer;

public class CustomerTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @Test
    
    //Tests to make sure the frequentCustomer method returns "frequent"
    public void testFrequentCustomer() {
        assertEquals("frequent", Customer.frequentCustomer());
    }

    //Tests to make sure the nonFrequentCustomer method returns "non-frequent"
    public void testNonFrequentCustomer() {
        assertEquals("non-frequent", Customer.nonFrequentCustomer());
    }

}
