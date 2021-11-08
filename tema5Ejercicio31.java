public class tema5Ejercicio31 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
         * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
         * de la mitad (división entera entre 2) de la altura más uno.
         */
        System.out.println("Introduce la altura que quieres que mida la L: ");
        int h = Integer.parseInt(System.console().readLine());

        for (int i = 1; i < h; i++) {
            System.out.println("*");
        }
        for (int j = 0; j <= h / 2; j++) {
            System.out.print("* ");
        }
    }
}
