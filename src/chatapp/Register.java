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
public class Register {    
    public Register() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Register Form");
        System.out.print("Username: ");
        ChatApp.username = scanner.nextLine();
        
        while (!Login.checkUsername(ChatApp.username)) {
            System.out.println("Invalid Username. Must contain an underscore and be less than 5 characters long");
            System.out.print("Username: ");
            ChatApp.username = scanner.nextLine(); 
        }
        
        System.out.println("Username successfully captured");
        
        System.out.print("Password: ");
        ChatApp.password = scanner.nextLine();
        
        while (!Login.checkPasswordComplexity(ChatApp.password)) {
            System.out.println("Invalid Password. Must be atleast 8 characters long, contain a special character, a digit, and a capital letter");
            System.out.print("Password: ");
            ChatApp.password = scanner.nextLine();
        }
        
        System.out.println("Password successfully captured");
        
        System.out.print("Phone number: ");
        ChatApp.phoneNumber = scanner.nextLine();
        
        while (!Login.checkCellPhoneNumber(ChatApp.phoneNumber)) {
            System.out.println("Cellphone number incorrectly formatted or does not contain international code");
            System.out.print("Phone number: ");
            ChatApp.phoneNumber = scanner.nextLine();
        }
        
        System.out.println("Cell phone number successfully added");
        
        System.out.println(registerUser());
    }
    
    public static String registerUser () {
        if (Login.checkUsername(ChatApp.username) && Login.checkPasswordComplexity(ChatApp.password) && Login.checkCellPhoneNumber(ChatApp.phoneNumber)) {
            ChatApp.registeredUser = true;
            return "User created successfully";
        } else if (!Login.checkUsername(ChatApp.username)) {
                ChatApp.registeredUser = false;
                return "Invalid Username. Must contain an underscore and be less than 5 characters long";
        } else if (!Login.checkPasswordComplexity(ChatApp.password)) {
            ChatApp.registeredUser = false;
            return "Invalid Password. Must be atleast 8 characters long, contain a special character, a digit, and a capital letter";
        } else {
            ChatApp.registeredUser = false;
            return "Cellphone number incorrectly formatted or does not contain international code, please correct the number and try again";
        }
    }
    
}
