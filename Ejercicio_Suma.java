/**
 * @author kevin
 */
public class Ejercicio_Suma {
    public static void main(String[] args) {
        // TODO code application logic here
        double suma, x, y;
        suma = 0.0;
        x = 20.0;
        suma = suma + x;
        y = 40.0;
        x = x + (y * y);
        suma = suma + (x / y);
        System.out.println("El valor de la suma es: " + suma);

    }
}