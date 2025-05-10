
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class LogIn {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String Firstname,Lastname,Username,Password,Phone;//Prompts user to recieve their input
        
        System.out.println("**********************");
        System.out.println("*******Register*****");
        System.out.println("**********************");
        System.out.print("Enter first Name:");
        Firstname = input.nextLine();
        System.out.print("Enter Last Name:");
        Lastname = input.nextLine();
        System.out.print("Enter Username:");
        Username = input.nextLine();
        System.out.print("Enter Password:");
        Password = input.nextLine();
        System.out.print("Enter Phone Number(starting with South African international code (+27)):");
        Phone = input.nextLine();
        
        
        Login login = new Login();//Instantiates and creates login object
        
        boolean validate Phone = Login.CheckCellPhonenumber(phone:Phone);
        boolean validate Username =  login.CheckUserName (username:Username);
        boolean validate Password = login.CheckPasswordcomplexity (password:Password);
        boolean validates Username;
        
        //Validates Username
        if (validatesUsername==true){
            System.out.println("Username captured successfully");
        }else {
            System.out.println("Username is incorrectly formatted, please ensure it underscore and contains no more than five characters in length");  
        }
        boolean validatesPassword = false;
        
        //validates Password
        if (validatesPassword==true){
            System.out.println("Password captured successfully");
        }else{
            System.out.println("Password is incorrectly formatted, please ensure it contains the following: At least 8 characters; A small letter; A special character");
        }
        boolean validatesPhone = false;
        //Validates Phonenumber
        if (validatesPhone==true){
            System.out.println("CellPhonenumber successfully captured");
        }else{
            System.out.println("CellPhonenumber is incorrectly formatted or not contain international code");
        }

        if (validatesUsername==true && validatesPassword==true && validatesPhone==true){
            System.out.println("You have registered successfully");
            String loginUsername = null;
            String loginPassword;
            
            System.out.println("*********************");
            System.out.println("*******LOGIN*********");
            System.out.println("*********************");
            
             System.out.print("Enter Username");
             LoginUsername = input.nextLine();
              System.out.print("Enter password");
              loginPassword = input.nextline();
              
            if (loginUsername.equals(Username)&& loginPassword.equals(Password)){
                System.out.printinln("Welcome" + Firstname + " " +) Lastname + "Great to see you again.");
            }else{
                System.out.println("Login failed! incorrect Username or Password");
            }
            }else{
                System.out.println("Failed to register!");
                main(null);
            }
        }
        
    

public String registerUSer(String Username, String Password, String Phone){
        boolean validatePhone = checkCellPhonenumber (phone:Phone);
        boolean validateUsername =checkUserName (username:Username);
        boolean validatePassword = checkPasswordComplexity (password:Password);

        if (validationUsername ==true && validatePhone ==true && validatePassword ==true){
            return true;
        }else{
            return false
