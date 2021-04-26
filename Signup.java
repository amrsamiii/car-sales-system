package carapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Signup extends Login {

    public Signup() {
    }

    

    



   

    Scanner input = new Scanner(System.in);
    ArrayList<User> sign = new ArrayList<>();
    User s = new User();

    public void signup() throws IOException {

        System.out.print("please enter your first name : ");
        s.setFirst_name(input.next());
        System.out.print("please enter your last name : ");
        s.setLast_name(input.next());
        System.out.print("please enter username :  ");
        s.setUsername(input.next());
        while (true) {
            System.out.print("please enter a new password  :  ");
            s.setPassword(input.next());
            System.out.print("please enter your email : ");
            s.setEmail(input.next());
            System.out.print("please enter your phone number : ");
            s.setPhone_number(input.next());
            System.out.print("please enter your gender : (F/M)");
            s.setGender(input.next());
            System.out.println("Finish");
            sign.add(s);
            File.writeCar(sign);
            System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ");
//            Menu k = new Menu();
//            k.user_menu();
            break;

        }
    }

    /**
     *
     */
    @Override
    public void log() {
        try {
            sign.clear();
            sign = File.readcar();
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("please enter username :  ");
        String user1 = input.next();

        System.out.print("please enter password :");
        String pass1 = input.next();
        boolean flag = false;
        for (User s : sign) {
            if (user1.equals(s.username) && pass1.equals(s.password)) {

                flag = true;
                System.out.println("correct");
                break;

            } else {
                flag = false;
            }

        }
        if (flag == false) {
            System.out.println("incorrect");

        }
           Menu k = new Menu();
        try {
            k.user_menu();
        } catch (IOException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}