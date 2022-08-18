/**
 * @author kevin
 */
public class Salario {
    public static void main(String[] args) {
        // TODO code application logic here
        int horas = 48;
        double valor_hora = 5000;
        double retencion = 0.125;

        double salario_bruto = horas * valor_hora;
        double retencion_valor = salario_bruto * retencion;
        double salario_neto = salario_bruto - retencion_valor;

        System.out.println("Salario bruto es " + salario_bruto);
        System.out.println("Salario neto es " + salario_neto);
        System.out.println("Retencion en la fuente es: " + retencion_valor);
    }

}