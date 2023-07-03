
package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            Object number = 10;
            String text = (String) number;
        } catch (ClassCastException e) {
            System.out.println("Se ha producido una excepcion de ClassCastException");
        }
    }
}
