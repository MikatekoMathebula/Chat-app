/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        
        while (!checkUsername(ChatApp.username)) {
            System.out.println("Invalid Username. Must contain an underscore and be less than 5 characters long");
            System.out.print("Username: ");
            ChatApp.username = scanner.nextLine(); 
        }
        
        System.out.println("Username captured successfully");
        
        System.out.print("Password: ");
        ChatApp.password = scanner.nextLine();
        
        while (!checkPsswordComplexity(ChatApp.password)) {
            System.out.println("Invalid Password. Must be atleast 8 characters long, contain a special character, a digit, and a capital letter");
            System.out.print("Password: ");
            ChatApp.password = scanner.nextLine();
        }
        
        System.out.println("Password captured successfully");
        
        System.out.print("Phone number: ");
        ChatApp.phoneNumber = scanner.nextLine();
        
        while (!checkCellPhoneNumber(ChatApp.phoneNumber)) {
            System.out.println("Invalid phone number. Must start with a valid country code, followed by numbers less than 10 digits");
            System.out.print("Phone number: ");
            ChatApp.phoneNumber = scanner.nextLine();
        }
        
        System.out.println(registerUser());
    }
    
    public static String registerUser () {
        if (checkUsername(ChatApp.username) && checkPsswordComplexity(ChatApp.password) && checkCellPhoneNumber(ChatApp.phoneNumber)) {
            ChatApp.registeredUser = true;
            return "User created successfully";
        } else if (!checkUsername(ChatApp.username)) {
            ChatApp.registeredUser = false;
            return "Invalid Username. Must contain an underscore and be less than 5 characters long";
        } else if (!checkPsswordComplexity(ChatApp.password)) {
            ChatApp.registeredUser = false;
            return "Invalid Password. Must be atleast 8 characters long, contain a special character, a digit, and a capital letter";
        } else {
            ChatApp.registeredUser = false;
            return "Invalid phone number. Must start with a valid country code, followed by numbers less than 10 digits";
        }
    }
    
    public static boolean checkUsername (String username) {
        return username.length() <= 5 && username.contains("_");
    }
    
    public static boolean checkPsswordComplexity (String password) {
        // variable that defines if the password is valid or not
        boolean isValid = false;
        
        Pattern specialCharacters = Pattern.compile("[^A-Za-z0-9]");
        Pattern upperCases = Pattern.compile("[A-Z]");
        
        Matcher charMatcher = specialCharacters.matcher(password);
        boolean hasSpecialCharacter = charMatcher.find();
        
        Matcher capitalMatcher = upperCases.matcher(password);
        boolean hasCapitalLetter = capitalMatcher.find();
        
        boolean lengthIsValid = password.length() >= 8;
        
        boolean hasDigit = false;
        for(char letter : password.toCharArray()) {
            if (Character.isDigit(letter)) {
                hasDigit = true;
                break;
            }
        }
        
        if (lengthIsValid && hasSpecialCharacter && hasCapitalLetter && hasDigit) {
            isValid = true;
        }
        
        return isValid;
    }
    
    public static boolean checkCellPhoneNumber (String phoneNumber) {
        String regex = "^\\+\\d{1,3}\\d{1,9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
}
