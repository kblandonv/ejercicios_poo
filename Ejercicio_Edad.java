import java.util.*;

/**
 * @author kevin
 */
public class Ejercicio_Edad {
    public static void main(String[] args) {
        // TODO code application logic here
        int juan, alberto, ana, mom;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan:");
        juan = entrada.nextInt();
        alberto = (juan * 2) / 3;
        ana = (juan * 4) / 3;
        mom = juan + alberto + ana;
        System.out.println("La edad de la mamá de Juan es: " + mom);
        System.out.println("La edad de Juan es: " + juan);
        System.out.println("La edad de Alberto es: " + alberto);
        System.out.println("La edad de Ana es: " + ana);

    }

}