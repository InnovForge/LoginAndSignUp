/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import service.LoginService;

/**
 *
 * @author bluez
 */
public class JUnitTestLogin {
    LoginService testLogin = new LoginService();;

    public JUnitTestLogin() {
    }
   // @Test
    public void testLoginSuccess()
    {
        String result = testLogin.login("nguyennhat082004@gmail.com", "123");
        assertEquals("Login successful!", result, "Login should succeed with correct credentials");
    }
    @Test
    public void checkLoginFailed()
    {
        String result = testLogin.login("nguyennhat082004@gmail.com", "12333333");
        assertEquals("Email or password is incorrect!", result, "Login should not succeed with not correct credentials");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
