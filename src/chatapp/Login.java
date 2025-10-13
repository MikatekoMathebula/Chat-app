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
    
        public static boolean checkUsername (String username) {
        return username.length() <= 5 && username.contains("_");
    }
    
    public static boolean checkPasswordComplexity (String password) {
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
        String regex = "^\\+27\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
}
