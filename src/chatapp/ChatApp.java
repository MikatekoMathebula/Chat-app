/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp;

/**
 *
 * @author RC_Student_lab
 */
public class ChatApp {

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
    }
    
}
