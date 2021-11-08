public class tema5Ejercicio35 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
         * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
         * igual a 3, en caso contrario se debe mostrar un mensaje de error
         */
        System.out.print("Introduzca la altura en numero impar que quieres darle a la X (minimo 3): ");
        int hintroducida = Integer.parseInt(System.console().readLine());
        int espacioInterno = 1;
        int h = hintroducida;

        if ((hintroducida >= 3) && (!(hintroducida % 2 == 0))) {
            for (int i = 1; i <= h / 2; i++) {
                System.out.print("*");
                for (int x = 1; x <= hintroducida - 2; x++) {
                    System.out.print(" ");
                }
                hintroducida = hintroducida - 2;
                System.out.print("*");
                System.out.println();
                for (int p = 1; p <= espacioInterno; p++) {
                    System.out.print(" ");
                }
                espacioInterno++;
            }
            // segunda parte
            int espacios = 1;
            System.out.print("*\n");
            hintroducida = h;
            for (int i = 1; i <= hintroducida / 2; i++) {
                for (int f = 1; f <= h / 2 - 1; f++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int x = 1; x <= espacios; x++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                h -= 2;
                espacios += 2;
            }
        } else {
            System.out.println("Has introducido un numero par o menor a tres.");
        }
    }

}
