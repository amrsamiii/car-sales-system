/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class admin extends Login{
    
    
     String user_admin = "amr";
     String pass_admin = "1234";
Scanner input = new Scanner(System.in);
    @Override
    public void log() {
         {
            User user = new User();
            System.out.print("Enter your username :  ");
            user.setUsername(input.next()) ;
            System.out.print("Enter your password :  ");
            user.setPassword(input.next());
            if (user.getUsername().equals(user_admin) && user.getPassword().equals(pass_admin)) {
                Menu a = new Menu();
                try {
                    a.admin_menu();
                } catch (IOException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                ArrayList<User> sign = new ArrayList<>();
                User u = new User();

                try {

                    sign = File.readcar();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                boolean flag = false;
                for (User s : sign) {
                    if (user.getUsername().equals(s.username) && user.getPassword().equals(s.password)) {

                        flag = true;
                        System.out.println("WELCOME TO CARS SHOWROOMS");
                        Menu u1 = new Menu();
                        try {
                            u1.user_menu();
                        } catch (IOException ex) {
                            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;

                    } else {
                        flag = false;
                    }

                }
                if (flag == false) {
                    System.out.println("INVALID USERNAME OR PASSWORD");
                    System.out.println("TRY AGAIN PLEASE");

                }


            }
        }
    }
 }
     


