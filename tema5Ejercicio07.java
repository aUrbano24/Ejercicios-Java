public class tema5Ejercicio07 {
    /*
     * 7. Realiza el control de acceso a una caja fuerte. La combinación será un
     * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
     * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
     * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     * Tendremos cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        int intentos = 4;
        int numero;
        boolean clave = false;
        do {
            System.out.println("Introduzca la clave de la caja fuerte:");
            numero = Integer.parseInt(System.console().readLine());
            if (numero == 2424) {
                clave = true;
            } else {
                System.out.println("La clave no es correcta, intentelo otra vez");
            }
            intentos--;

        } while ((intentos > 0) && (!clave));

        if (clave) {
            System.out.println("La caja se a abierto");
        } else {
            System.out.println("Te has quedado sin intentos");
        }
    }
}
