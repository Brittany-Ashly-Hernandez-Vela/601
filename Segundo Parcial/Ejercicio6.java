package ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file); // Genera la excepción
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido una excepcion de FileNotFoundException");
        }
    }
}
