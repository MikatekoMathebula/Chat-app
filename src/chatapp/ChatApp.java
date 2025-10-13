/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class ChatApp {
    public static Scanner scanner = new Scanner(System.in);

    public static String username = "", password = "", phoneNumber = "";
    public static boolean registeredUser = false, loggedIn = false;
    
    public static void main(String[] args) {
        
        while (!registeredUser) {
            Register register = new Register();
        }
        
        while (!loggedIn) {
            Login login = new Login();
        }
        
        System.out.println("Welcome " + username + " It is great to see you.");
        
        int selectedMenu = -1;
        while (selectedMenu == -1) {
            
            System.out.println("***************************************");
            System.out.println("Welcome to QuickChat");
            System.out.println("***************************************");
            
            System.out.println("Menu");
            
            System.out.println("1. Send Message");
            System.out.println("2. Show recently sent messages");
            System.out.println("3. Exit");
            
            System.out.print("> ");
            selectedMenu = scanner.nextInt();
            
            try {
                switch (selectedMenu) {
                    case 1:
                        boolean sendingMessage = true;
                        while (sendingMessage) {
                            Boolean messageSent = Message.sendMessage();
                            
                            if (messageSent) {
                                sendingMessage = false;
                            }
                        }
                        selectedMenu = -1;
                        break;
                    case 2:
                        System.out.println("Coming Soon");
                        selectedMenu = -1;
                        break;
                    case 3:
                        System.out.println("Exiting application.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        selectedMenu = -1;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Please try to enter a number");
                return;
            }
        }
        
        
        
    }
    
    
    
}
