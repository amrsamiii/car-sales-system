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


public class File {

    public static void writeCar(ArrayList<User> sign) {
        try {

            BufferedWriter Bs = new BufferedWriter(new FileWriter("user.txt", true));
            for (int i = 0; i < sign.size(); i++) {
                Bs.write(sign.get(i).getUsername() + ";" + sign.get(i).getPassword());
                Bs.newLine();
            }
            Bs.close();

        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<User> readcar() throws IOException {
        ArrayList<User> z = new ArrayList<>();

        try {
            BufferedReader BR;
            BR = new BufferedReader(new FileReader("user.txt"));
            String line = null;
            while ((line = BR.readLine()) != null) {
                String[] x = line.split(";");
                User n = new User(x[0], x[1]);
                z.add(n);
            }
            BR.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }

        return z;
    }

}