import java.util.*;

/**
 * @author kevin
 */
public class Area_Longitud {
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        System.out.println("Ingrese el tamaño del radio: ");
        Scanner Radio = new Scanner(System.in);
        radio = Radio.nextDouble();
        double Area = Math.PI * Math.pow(radio, 2);
        double Longitud = Math.PI * 2 * radio;
        System.out.println("El area del circulo es de " + Math.round(Area * 100d) / 100d);
        System.out.println("La longitud del circulo es de " + Math.round(Longitud * 100d) / 100d);

    }

}