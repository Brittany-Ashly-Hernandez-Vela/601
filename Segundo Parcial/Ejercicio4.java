
package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); 
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una excepcin de NullPointerException");
        }
    }
}
