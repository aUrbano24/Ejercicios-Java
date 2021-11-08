public class tema5Ejercicio40 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que pinte por pantalla un rombo hueco hecho con
         * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
         * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
         * mensaje de error.
         */
        System.out.print("Introduzca la altura: ");
        int hIntroducida = Integer.parseInt(System.console().readLine());
        int espacio = 0;
        int h = hIntroducida;
        for (int i = 1; i <= hIntroducida / 2 + 1; i++) {
            for (int f = 0; f <= h / 2 - 1; f++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < espacio; j++) {
                System.out.print(" ");
            }
            if (!(espacio == 0)) {
                System.out.print("*");
            }
            System.out.println();
            h -= 2;
            espacio += 2;
        }
        // segunda parte
        espacio = 1;
        h = hIntroducida;
        for (int i = 1; i <= hIntroducida / 2 + 1; i++) {
            for (int j = 1; j <= espacio; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < h / 2; k++) {
                System.out.print(" ");
            }
            if (!(hIntroducida - 2 == 1)) {
                System.out.print("*\n");
            }
            espacio += 1;
            h -= 2;
            hIntroducida -= 2;
        }
    }
}
