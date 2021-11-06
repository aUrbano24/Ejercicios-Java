
/**
 * tema4Ejercicio25
 */
import java.util.Scanner;

public class tema4Ejercicio25 {
    public static void main(String[] args) {
        /*
         * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
         * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
         * según el alto y el ancho. El precio base de una bandera es de un céntimo de
         * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
         * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
         * son 3.25 €. El IVA ya está incluido en todas las tarifas.
         */
        Scanner es = new Scanner(System.in);
        System.out.println("Introduce la altura de la bandera en cm: ");
        double altura = Double.parseDouble(System.console().readLine());
        System.out.println("Introduce la anchura de la bandera en cm: ");
        double anchura = Double.parseDouble(System.console().readLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        boolean escudo = ((es.nextLine()).toLowerCase()).equals("s");

        String escudoCadena;
        double precioEscudo;

        if (escudo) {
            escudoCadena = "Con escudo";
            precioEscudo = 2.50;
        } else {
            escudoCadena = "Sin escudo";
            precioEscudo = 0;
        }
        System.out.println("Gracias aqui tiene su ticket.\n");
        System.out.printf("Bandera de %5.2f cm2:       %-5.2f\n", altura * anchura, (anchura * altura) / 100);
        System.out.printf("%s:                 %-5.2f\n", escudoCadena, precioEscudo);
        System.out.printf("Gastos de Envio:            %-5.2f\n", 3.25);
        System.out.printf("Total:                      %-5.2f\n", ((anchura * altura) / 100) + precioEscudo + 3.25);

    }
}