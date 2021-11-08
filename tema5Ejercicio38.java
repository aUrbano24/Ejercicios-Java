public class tema5Ejercicio38 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
         * El programa debe pedir la altura. Se debe comprobar que la altura sea un
         * número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
         * de error.
         */
        System.out.print("Introduce la altura: ");
        int hIntroducida = Integer.parseInt(System.console().readLine());
        int h = hIntroducida;
        int espacios = 1;
        if ((hIntroducida >= 3) && (!(hIntroducida % 2 == 0))) {
            for (int j = 1; j <= hIntroducida / 2; j++) {
                for (int i = 1; i <= h; i++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int x = 1; x <= espacios; x++) {
                    System.out.print(" ");
                }
                h -= 2;
                espacios++;
            }
            espacios = 1;
            h = hIntroducida;
            // segunda parte
            for (int j = 1; j <= hIntroducida / 2 + 1; j++) {
                for (int i = 1; i <= espacios; i++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int x = 1; x <= h / 2 - 1; x++) {
                    System.out.print(" ");
                }
                espacios += 2;
                h -= 2;
            }
        } else {
            System.out.println("El numero que has introducida era menor a 3 o par.");
        }
    }
}
