package carapp;

import java.io.IOException;
import java.util.Scanner;

public class Carapp {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("WELCOME TO CARS SHOWROOMS");

            while (true) {
                System.out.println("1)Login  ");
                System.out.println("2) Signup  ");
                System.out.print("Please choose one of them :  ");
                int number;
                number = input.nextInt();
                System.out.flush();
                switch (number) {
                    case 1:
                        admin f = new admin();
                        f.log();
                        break;
                    case 2:
                        Signup s = new Signup();
                        s.signup();
                        s.log();
                        break;
                    default:
                        System.out.println("Please enter a valid choice ");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("The following error occured : " + e.getMessage());
        }
    }

}