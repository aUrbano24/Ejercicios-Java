public class tema5Ejercicio24 {
    public static void main(String[] args) {
        int numero;
        int altura;

        System.out.print("Introduzca el numero: ");
        numero = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca la altura: ");
        altura = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i; j++)
                System.out.print(" ");

            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == altura - 1) {
                    System.out.print(numero + " ");
                    numero += 1;
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}