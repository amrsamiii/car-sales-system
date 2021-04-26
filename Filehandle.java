package carapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filehandle {
//function used to write on file

    public static void writeCar(ArrayList<Car> c, boolean b) {
        try {

            BufferedWriter BW = new BufferedWriter(new FileWriter("Car.txt", b));
            for (int i = 0; i < c.size(); i++) {
                //Integer.valueOf("12");
                //String.valueOf(c.get(i).getModel());
                BW.write(c.get(i).getType() + ";" + c.get(i).getModel() + ";" + c.get(i).getYear() + ";" + c.get(i).getColor() + ";" + c.get(i).getCondition() + ";" + c.get(i).getTransmition_type() + ";" + c.get(i).getPayment_option() + ";" + c.get(i).getKilometers() + ";" + c.get(i).getEngine_capacity() + ";" + c.get(i).getPrice());
                BW.newLine();
            }
            BW.close();

        } catch (IOException ex) {
            Logger.getLogger(Filehandle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//function used to read from the file

    public static ArrayList<Car> readcar() throws IOException {
        ArrayList<Car> cars = new ArrayList<>();

        try {
            BufferedReader BR;
            BR = new BufferedReader(new FileReader("Car.txt"));
            String line = null;
            while ((line = BR.readLine()) != null) {
                String[] x = line.split(";");
                Car n = new Car(x[0],
                        x[1],
                        Integer.valueOf(x[2]),
                        x[3],
                        x[4],
                        x[5],
                        x[6],
                        Long.valueOf(x[7]),
                        Integer.valueOf(x[8]),
                        Integer.valueOf(x[9]));
                cars.add(n);
            }
            BR.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filehandle.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cars;
    }

}