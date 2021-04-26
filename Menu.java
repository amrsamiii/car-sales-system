package carapp;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    runProgram r = new runProgram();
    Scanner input = new Scanner(System.in);
    int admin_m; //variable for switch case for admin menu//
    int user_m;  //variable for switch case for user menu//

    public void admin_menu() throws IOException {

        while (true) {
            System.out.println("1.Addcar");
            System.out.println("2.Display");
            System.out.println("3.Remove");
            System.out.println("4.Edit");
            System.out.println("5.Exit");
            System.out.print("Please choose one of them :   ");
            admin_m = input.nextInt();
            runProgram x = new runProgram();
            switch (admin_m) {
                case 1:
                    x.addcar();
                    break;
                case 2:
                    x.display();
                    break;
                case 3:
                    x.display();
                    System.out.println("Enter the number of the cars that you want to remove : ");
                    int index1 = input.nextInt();
                    x.re(index1 - 1);
                    break;
                case 4:
                    x.display();
                    System.out.println("Enter index of the car you want to edit in : ");
                    int index = input.nextInt();
                    while (true) {
                        //System.out.print("1 - type \t 2- model \t 3- year \t 4- color \t 5- condition \t 6- transmition type \t 7-paymnet \t 8-engine capacity \t 9-kilometers \t 10-price" );
                        System.out.println("1.Type");
                        System.out.println("2.Model");
                        System.out.println("3.Year");
                        System.out.println("4.Color");
                        System.out.println("5.Condition");
                        System.out.println("6.Transmition type");
                        System.out.println("7.Payment");
                        System.out.println("8.Engine capacity");
                        System.out.println("9.Kilometers");
                        System.out.println("10.Price");
                        System.out.println("Enter the number of option you want to edit : ");
                        String t = input.next();
                        x.edit(t, index - 1);
                        if (Integer.valueOf(t) >= 1 && Integer.valueOf(t) <= 10) {
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    defalult:
                    System.out.println("Please enter a valid number : ");

            }
        }

    }

    public void user_menu() throws IOException {
        while (true) {

            System.out.println("1 Display cars ");
            System.out.println("2 Search ");
            System.out.println("3 Buy ");
            System.out.println("4.Exit");
            System.out.println("Please choose one of them : ");
            user_m = input.nextInt();
            switch (user_m) {
                case 1:
                    r.display();
                    break;
                case 2:
                    r.findcar();
                    break;
                case 3:
                    r.buycar();
                    break;
               case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid number : ");
            }
        }
    }
}