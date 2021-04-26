package carapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class runProgram {

    public void addcar() {
        ArrayList<Car> car = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("How many cars you want to add ?  ");
        int number_of_cars = input.nextInt();

        for (int i = 0; i < number_of_cars; i++) {

            Car c = new Car();
            System.out.printf("Car number %d", i + 1);
            System.out.println("");
            System.out.print("Enter type :  ");
            c.setType(input.next());
            System.out.print("Enter model :  ");
            c.setModel(input.next());
            System.out.print("Enter year :  ");
            c.setYear(input.nextInt());
            System.out.print("Enter color :  ");
            c.setColor(input.next());
            System.out.print("Enter condition :  ");
            c.setCondition(input.next());
            System.out.print("Enter transimition type :  ");
            c.setTransmition_type(input.next());
            System.out.print("Enter kilometers :  ");
            c.setKilometers(input.nextLong());
            System.out.print("Enter engine capcity :  ");
            c.setEngine_capacity(input.nextInt());
            System.out.print("Enter price :   ");
            c.setPrice(input.nextLong());
            car.add(c);
            System.out.println("Done");

        }
        Filehandle.writeCar(car, true);

    }

    public void display() throws IOException {

        ArrayList<Car> car1 = new ArrayList<>();
        car1 = Filehandle.readcar();
        for (Car c : car1) {
            System.out.println("Type :   ");
            System.out.println(c.getType());
            System.out.println("Color :  ");
            System.out.println(c.getColor());
            System.out.println("Year :  ");
            System.out.println(c.getYear());
            System.out.println("Model :  ");
            System.out.println(c.getModel());
            System.out.println("Condition :  ");
            System.out.println(c.getCondition());
            System.out.println("Engine capacity :  ");
            System.out.println(c.getEngine_capacity());
            System.out.println("Kilometers :  ");
            System.out.println(c.getKilometers());
            System.out.println("Transmition type :  ");
            System.out.println(c.getTransmition_type());
            System.out.println("Price :  ");
            System.out.println(c.getPrice());
            System.out.println();
        }
        
    }

    //remove function
    public void re(int index) throws IOException {
        ArrayList<Car> c = new ArrayList<>();

        c = Filehandle.readcar();
        c.remove(index);
        Filehandle.writeCar(c, false);

    }

    public void edit(String t, int i) throws IOException {
        ArrayList<Car> c = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        c = Filehandle.readcar();

        if (t.equalsIgnoreCase("1")) {
            System.out.print("Enter new type :  ");
            String x = input.next();
            c.get(i).setType(x);

        } else if (t.equalsIgnoreCase("2")) {
            System.out.print("Enter new model :  ");
            String x = input.next();
            c.get(i).setModel(x);
        } else if (t.equalsIgnoreCase("3")) {
            System.out.print("Enter new year :  ");
            int x = input.nextInt();
            c.get(i).setYear(x);
        } else if (t.equalsIgnoreCase("4")) {
            System.out.print("Enter new color :  ");
            String x = input.next();
            c.get(i).setColor(x);
        } else if (t.equalsIgnoreCase("5")) {
            System.out.print("Enter new condition :  ");
            String x = input.next();
            c.get(i).setCondition(x);

        } else if (t.equalsIgnoreCase("6")) {
            System.out.print("Enter new transmition type :  ");
            String x = input.next();
            c.get(i).setTransmition_type(x);

        } else if (t.equalsIgnoreCase("8")) {
            System.out.print("Enter new engine capacity :  ");
            int x = input.nextInt();
            c.get(i).setEngine_capacity(x);

        } else if (t.equalsIgnoreCase("9")) {
            System.out.print("Enter new kilometers :  ");
            Long x = input.nextLong();
            c.get(i).setKilometers(x);

        } else if (t.equalsIgnoreCase("10")) {
            System.out.print("Enter new price :  ");
            long x = input.nextLong();
            c.get(i).setPrice(x);
        }

        System.out.println("Operation done successfully");

        Filehandle.writeCar(c, false);

    }

    public void buycar() throws IOException {

        Scanner input = new Scanner(System.in);
        display();
        System.out.println("Enter the number of the car you want to buy : ");
        int in = input.nextInt();
        re(in);
        System.out.println("Enter payment option");
        String option = input.next();
        String serial_number;
        int ccv;
        String month ;
        int year ;
        if ("visa".equals(option)) {
            System.out.print("Enter your serial number : (15 number)");
            serial_number = input.next();
            System.out.print("Enter expired date : (MM/YYYY) ");
            System.out.print("Enter month : (MM) ");
            month  = input.next();
            System.out.print("Enter year : (YYYY) ");
            year = input.nextInt();
            System.out.print("Enter CCV : (3 numbers) ");
            ccv = input.nextInt();
            System.out.println("Completed successfully");

        } else {
            System.out.println("Thank you for using our system!");
        }
        System.out.println("Finish");
    }

    public void findcar() throws IOException {
        ArrayList<Car> ca = new ArrayList<>();
        ca.clear();
        ca = Filehandle.readcar();
        Scanner input = new Scanner(System.in);
        boolean found = false;

        System.out.print("Enter Manufacture type :");
        String searchType = input.nextLine();
        for (int i = 0; i < ca.size(); i++) {
            if (ca.get(i).getType().equals(searchType)) {
                System.out.println("Type :   ");
                System.out.println(ca.get(i).getType());
                System.out.println("Model :  ");
                System.out.println(ca.get(i).getModel());
                System.out.println("Year :  ");
                System.out.println(ca.get(i).getYear());
                System.out.println("Color :  ");
                System.out.println(ca.get(i).getColor());
                System.out.print("Enter condition :  ");
                System.out.println(ca.get(i).getCondition());
                System.out.println("Transmition type :  ");
                System.out.println(ca.get(i).getTransmition_type());
                System.out.println("Kilometers :  ");
                System.out.println(ca.get(i).getKilometers());
                System.out.println("Engine capacity :  ");
                System.out.println(ca.get(i).getEngine_capacity());
                System.out.println("Price :  ");
                System.out.println(ca.get(i).getPrice());
                found = true;
            }
        }
        if (found != true) {
            System.out.println("There is no car with this information");
        }

    }

}