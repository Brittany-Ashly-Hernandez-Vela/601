
package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); 
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una excepcion de NullPointerException");
        }
    }
}

