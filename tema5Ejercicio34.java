public class tema5Ejercicio34 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que pida dos números por teclado y que luego mezcle en
         * dos números diferentes los dígitos pares y los impares. Se van comprobando
         * los dígitos de la siguiente manera: primer dígito del primer número, primer
         * dígito del segundo número, segundo dígito del primer número, segundo dígito
         * del segundo número, tercer dígito del primer número… Para facilitar el
         * ejercicio, podemos suponer que el usuario introducirá dos números de la misma
         * longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en
         * lugar de int donde sea necesario para admitir números largos.
         */
        System.out.println("Introduzca un numero: ");
        int nIntroducido = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca otro numero: ");
        int nIntroducido2 = Integer.parseInt(System.console().readLine());
        int numeroPar = 0;
        int numeroImpar = 0;
        int digito = 0;
        int longitud = 0;
        int volteado1 = 0;
        int volteado2 = 0;
        // 9345 5439
        while (nIntroducido > 0) {
            volteado1 = (volteado1 * 10) + (nIntroducido % 10);
            nIntroducido /= 10;
            longitud++;
        }
        while (nIntroducido2 > 0) {
            volteado2 = (volteado2 * 10) + (nIntroducido2 % 10);
            nIntroducido2 /= 10;
        }
        for (int i = 1; i <= longitud; i++) {
            digito = volteado1 % 10;
            if (digito % 2 == 0) {
                numeroPar = numeroPar * 10 + digito;
            } else {
                numeroImpar = numeroImpar * 10 + digito;
            }
            // segundo numero
            digito = volteado2 % 10;
            if (digito % 2 == 0) {
                numeroPar = numeroPar * 10 + digito;
            } else {
                numeroImpar = numeroImpar * 10 + digito;
            }
            volteado1 /= 10;
            volteado2 /= 10;
        }
        System.out.println("Se ha formado el numero " + numeroPar + " como numero par" + " y " + numeroImpar
                + " como numero impar.");

    }
}
