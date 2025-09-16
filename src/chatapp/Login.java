/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login {    
    Scanner scanner = new Scanner(System.in);
    
    public Login() {
        System.out.println("Login Form");
        System.out.print("Username:");
        String username = scanner.nextLine();
        
        System.out.print("Password:");
        String password = scanner.nextLine();
        
        System.out.println(returnLoginStatus(username, password));
    }
    
    public static boolean loginUser (String username, String password) {
        return username.equals(ChatApp.username) && password.equals(ChatApp.password);
    }
    
    public static String returnLoginStatus (String username, String password) {
        if (loginUser(username, password)) {
            ChatApp.loggedIn = true;
            return "Logged in successfully";
        } else {
            ChatApp.loggedIn = false;
            return "Incorrect username or password";
        }
    }
    
}
