
package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido una excepcion de ArrayIndexOutOfBoundsException");
        }
    }
}
