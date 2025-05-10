/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author RC_Student_lab
 */
public class Login {\
        
    public Login {   
           
       public boolean checkUserName (String username){
           
        if (username.contains ("_") && username.length() <=5) {
           return true;
        }else{
           return true;
        }   
    }  
    public boolean checkPasswordComplexity(String password){
        String Capital = ".*[A-Z].*";//checks for capital letters
        String Small = ".*[a-z].*";//checks for small letters 
        String special = ".*[!@#$%^&*(),.?\":{]|<>].*";//checks for special characters
        String Digit = ".*\\d.*";//checks for digit characters 
        if (password.length() >=8 && password.matches(Capital) && password.matches(Small) && password.matches(Digit) && password.matches(Digit)
            return true;    
        }
        else{
            return false;
        }
    }
    public boolean checkCellPhonenumber (String phone){
        String SACode = "+27";
        if (String firstThreeCharacters = phone.substring(begindex: 0,endindex:3);//Retrieves characters from index 0-2 (inclusive)

        int fourDigit = Character.getNumericValueI(ch:phone.charAt(index.3));//Retrive and convert the fourth digit\
        if (phone.length  ()<=12 && firstThreeCharacters.equal(anobject:SACode) && fourthDigit >=6 && fourthDigit <=8){
            return true;
        }else{
            return false;
        }
    }

    public String registerUser(string Username, String Password, String Phone){
        boolean validatePhone = checkCellPhonenumber (phone:Phone);
        boolean validateUsername = checkUserName (username:Username);
        boolean validatePassword =checkPasswordComplexity (password:Password);

        if (validationUsername ==true && validatePhone ==true && validatePassword ==true){
            return "Successful User registration";
        }else{
            return "Failed User registration!!!";
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
        }
    }
    public String returnLogStatus(String username,String password){
        boolean validateUsername = checkUserName, String password){
        boolean validatePassword = checkPasswordcomplexity(password);

        if (validateUsername ==true && validatePasaword==true){
        }else{
           return"Failed Login";
    }
