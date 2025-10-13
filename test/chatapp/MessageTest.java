/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package chatapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author RC_Student_Lab
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sendMessage method, of class Message.
     */
    
    int noOfMessages = 2;
    String reciepient1 = "+27718693002";
    String sendMessage1 = "Select Send";
    String message1 = "Hi Keegan, did you receive the payment?";
    
    String reciepient2 = "08575975889";
    String sendMessage2 = "Select Discard";
    String message2 = "Hi Keegan, did you receive the payment?";
    
    @Test
    public void testIncorrectMessageLength() {
        System.out.println("sendMessage");
        Boolean expResult = false;
        Boolean result = "he fdas fdas fdsa fdsaf dsaf dsanf kdsa ndsajf nkdsahjf kdshak jfhdskajh fkdsjah fkjhdsakh fkdsah fkhdsah fkdsah fkdsahfk jhdsajkhf kjdsa fkdjsah fkdjshakjf hdskagfjdsahg kldashg jasfh daskjhf lsadgj ldashg jkadsjhf ldsakhjf lasdkfjnasd asdfjk hdsaklfhndslkajfb kljdsabgknfdak ldsjdas vbdsajk bfvldsjab fljkdsba fbdsajkv lkfdgj kdfhslgsajd blsadhj fdsajkb lasdj vblfagj ldaskfbldasjfbldska jkgdasn glbfadj nsa;kldsaj lgjdbas flkbdsajlbg lasgjsad lgdjsab lsdabg ldasjb gldsa ldsa lgjbdsal gbdsalbg lsdab ldbsa lfbldsabdsa l as jdsaldsa fb asfb sakl fdasjk fbdsabg skbdask".split("").length <= 250;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCorrectMessageLength() {
        System.out.println("sendMessage");
        Boolean expResult = true;
        Boolean result = message1.split("").length <= 250;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        @org.junit.jupiter.api.Test
    public void testValidPhoneNumber() {
        System.out.println("validPhoneNumber");
        boolean expResult = true;
        boolean result = Login.checkCellPhoneNumber(reciepient1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testInvalidPhoneNumber() {
        System.out.println("validPhoneNumber");
        boolean expResult = false;
        boolean result = Login.checkCellPhoneNumber(reciepient2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testValidMessageHash() {
        System.out.println("validPhoneNumber");
        boolean expResult = true;
        boolean result = Message.checkMessageHash("00:0:HITONIGHT");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testInvalidMessageHash() {
        System.out.println("validPhoneNumber");
        boolean expResult = false;
        boolean result = Message.checkMessageHash("00:D");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
