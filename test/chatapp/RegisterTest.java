/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegisterTest {
    
    @Test
    public void usernameCorrectlyFormatted() {
        System.out.println("verifyUsername");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = Register.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void usernameIncorrectlyFormatted() {
        System.out.println("verifyUsername");
        String username = "kyle!!!!!!!";
        boolean expResult = false;
        boolean result = Register.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPsswordComplexity method, of class Register.
     */
    @Test
    public void testValidCheckPsswordComplexity() {
        System.out.println("checkPsswordComplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Register.checkPsswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInvalidCheckPsswordComplexity() {
        System.out.println("checkPsswordComplexity");
        String password = "password";
        boolean expResult = false;
        boolean result = Register.checkPsswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validPhoneNumber method, of class Register.
     */
    @Test
    public void testValidPhoneNumber() {
        System.out.println("validPhoneNumber");
        String phoneNumber = "+27838968976";
        boolean expResult = true;
        boolean result = Register.checkCellPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInvalidPhoneNumber() {
        System.out.println("validPhoneNumber");
        String phoneNumber = "08966553";
        boolean expResult = false;
        boolean result = Register.checkCellPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
