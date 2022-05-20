/**
 * This is testing the BankMain method in the Main folder
 * Simple test to make sure the deposit amount equals the expected outcome.
 */

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BankAccount;

public class BankAccountTest {
    @Test
     //will test to make sure this works

    public void testDeposit() {
         //Set up
        BankAccount user = new BankAccount("Twiggy", 20);
        user.deposit(50);

         //expected value should be 70
        Double expectedResult = (double) 70;

    //assertEquals to get actual value
    assertEquals((Double) expectedResult, (Double) user.balance);
}
}
