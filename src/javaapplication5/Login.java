/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author c0647896
 */
public class Login {
    public  void doLogin(){
        String username;
        String password;
        
        System.out.println("enter a username and password");
        Scanner kb = new Scanner(System.in);
        username = kb.nextLine();
        password = kb.nextLine();
    }
    
}
