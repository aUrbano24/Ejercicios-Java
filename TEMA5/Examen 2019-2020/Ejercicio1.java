/**
 * Ejercicio1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /**
         * Implemente un programa que dibuje verticalmente en consola un gusano. El
         * gusano será dibujado interactivamente según la voluntad del usuario, a razón
         * de un carácter por línea, mediante el control de las siguientes pulsaciones
         * de teclas: a) Tecla J: En la siguiente línea, el gusano se desplaza una
         * posición hacia la izquierda de la consola respecto de la última posición. b)
         * Tecla K: En la siguiente línea, el gusano permanece en la misma posición c)
         * Tecla L: En la siguiente línea, el gusano se desplaza una posición hacia la
         * derecha de la consola respecto de la última posición d) Tecla S: El programa
         * finaliza.
         */
        String letra = "";
        int longitud = 0;
        System.out.print("l = derecha, j = izquierda k = mantener: ");
        while (!(letra.toLowerCase().equals("s"))) {
            letra = System.console().readLine();
            System.out.println();
            if (letra.toLowerCase().equals("l")) {
                longitud++;
            }
            if (letra.toLowerCase().equals("j")) {
                longitud--;
            }
            for (int i = 1; i <= longitud; i++) {
                System.out.print(" ");
            }
            if (!(letra.equals("s"))) {
                System.out.print("*                   Introduce (j,k o l):");
            }

        }

    }
}