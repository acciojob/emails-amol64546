package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        if(!oldPassword.equals(this.password)) return;
        // 1. It contains at least 8 characters
        if(newPassword.length()!=8) return;
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean isDigit = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecial = false;

        for(char ch: newPassword.toCharArray()){
            if(Character.isDigit(ch)) isDigit = true;
            else if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)) isUpper = true;
                else if(Character.isLowerCase(ch)) isLower = true;
            }else{
                isSpecial = true;
            }
        }
        if(isDigit && isLower && isUpper && isSpecial){
            this.password = newPassword;
        }

    }
}
