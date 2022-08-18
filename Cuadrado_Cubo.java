import java.util.*;

/**
 *
 * @author kevin
 */
public class Cuadrado_Cubo {
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        System.out.println("Ingrese un numero");
        Scanner Numero = new Scanner(System.in);
        numero = Numero.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        System.out.println("El cuadrado del numero es de " + Math.round(cuadrado * 100d) / 100d);
        System.out.println("El cubo del numero es de " + Math.round(cubo * 100d) / 100d);
    }

}