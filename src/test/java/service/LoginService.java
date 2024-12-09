/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import fronent.Login;

/**
 *
 * @author bluez
 */
public class LoginService {
    Login login = new Login();
     public String login(String email, String password) {
        
        if(login.loginUser(email, password))
        {
              return "Login successful!";
        }
        return "Email or password is incorrect!";
    }
}
