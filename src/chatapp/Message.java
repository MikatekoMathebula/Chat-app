/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author RC_Student_Lab
 */
public class Message {
    public static List<String> messages = new ArrayList<>();
    public static List<String> messagesIDs = new ArrayList<>();
    public static List<String> recipients = new ArrayList<>();
    public static List<Integer> messagesNumbers = new ArrayList<>();
    public static List<String> messageHashes = new ArrayList<>();
    public static List<String> sendMessages = new ArrayList<>();
    
    static String messageID;
    static int noOfMessages; 
    static String recipient;
    static String message;
    static String messageHash;
    static String sendMessage;
    
    static Scanner scanner = new Scanner(System.in);
    
    public Message(String messageID, int messageNo, String recipient, String message, String messageHash, String sendMessage) {
        messages.add(message);
        messagesIDs.add(messageID);
        recipients.add(recipient);
        messagesNumbers.add(messageNo);
        messageHashes.add(messageHash);
        sendMessages.add(sendMessage);
    }
    
    public static Boolean sendMessage() {
        try {
            System.out.println("How many messages do you want to send");
            noOfMessages = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < noOfMessages; i++) {
                Random random = new Random();
                // Define the range for a 10-digit number
                // Smallest 10-digit number: 1,000,000,000
                long min = 1000000000L; 
                // Largest 10-digit number: 9,999,999,999
                long max = 9999999999L;

                // Generate a random long within the specified range
                long random10DigitNumber = min + (long)(random.nextDouble() * (max - min + 1));
                
                messageID = Long.toString(random10DigitNumber);
                
                if ( checkMessageID(messageID)) {
                    System.out.println("Message ID captured successfully");
                } else {
                    break;
                }
                
                System.out.print("Message: ");
                message = scanner.nextLine();
                
                messageHash = createMessageHash(message, i);
                
                sendMessage = sentMessage();
                
                System.out.println("done");
                
                // Construct the string to be displayed
                String messageDetails = "MessageID: " + messageID + "\n"
                        + "Message Hash: " + messageHash + "\n"
                        + "Recipient: " + recipient + "\n"
                        + "Message: " + message;

                // Display the message in a dialog box
                // It works and you need to minimize netbeans to see it
                JOptionPane.showMessageDialog(null, messageDetails);
                System.out.println("Done");
            }
            
            storeMessage();
            
            // Initialize a counter variable
            int totalMessagesSent = 0;

            // Loop or method calls for sending messages
            // For each message sent, increment the counter
            for (int i = 0; i < messages.size(); i++) {
                // Code to send a message...
                totalMessagesSent++;
}           

            // After all messages have been sent, display the total count
            JOptionPane.showMessageDialog(null, "Total number of messages sent: " + returnTotalMessagess(), "Summary", JOptionPane.INFORMATION_MESSAGE);
            
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid option. Please try to enter a number");
            return false;
        }
    }
    
    public static boolean checkMessageID(String messageID) {
        return messageID.length() <= 10;
    }
    
    public static boolean checkMessageHash(String recipientCell) {
        return recipientCell.substring(0, 2).equals("+27") && recipientCell.substring(2).length() < 10;
    }

    public static String createMessageHash(String message, int Index) {
        return message.substring(0, 1) + ":" + Index + message.split("")[0] + message.split("")[message.length() - 1];
    }
    
    public static String sentMessage() {
        System.out.println("Choose one of the following options");
                System.out.println("1. Send Message");
                System.out.println("2. Desregard Message");
                System.out.println("3. Store Message to send later");
                
                System.out.print("> ");
                int option = scanner.nextInt();
                scanner.nextLine();
                
                String response = "";
                
                switch (option) {
                    case 1 -> response = "Send Message";
                    case 2 -> response = "Disregard Message";
                    case 3 -> response = "Store Message to send later";
                }
                
                return response;
    }
    
    public String printMessages() {
        return "";
    }
    
    public static int returnTotalMessagess() {
        int sentMessages = 0;
        for (String message : sendMessages) {
            if ("Send Message".equals(message)) {
                sentMessages += 1;
            }
        }
        return sentMessages;
    }
    
    public static void storeMessage() {
        Message newMessage = new Message(messageID, noOfMessages, recipient, message, messageHash, sendMessage);
    }
    
    
    
}
