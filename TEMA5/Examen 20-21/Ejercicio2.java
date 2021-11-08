public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Implemente un programa que solicite al usuario un número entero largo y
         * positivo. Dicho programa obtendrá dos enteros largos a partir de él, y los
         * presentará por pantalla. Uno de ellos contendrá los dígitos pares en el mismo
         * orden en el que aparecen en el número de partida, y el otro contendrá los
         * dígitos impares en orden inverso al que aparecen en el número de partida. Vea
         * los siguientes ejemplos:
         */
        System.out.print("Introduce un numero por pantalla: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numero = numeroIntroducido;
        int volteado = 0;
        int digito = 0;
        int numeroPar = 0;
        int numeroImpar = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }
        while (volteado > 0) {
            digito = volteado % 10;
            if (digito % 2 == 0) {
                numeroPar *= 10;
                numeroPar += digito;
            }
            volteado /= 10;
        }
        numero = numeroIntroducido;
        while (numero > 0) {
            digito = numero % 10;
            if (!(digito % 2 == 0)) {
                numeroImpar *= 10;
                numeroImpar += digito;
            }
            numero /= 10;
        }

        System.out.println("Del numero " + numeroIntroducido + " he sacado los numeros: ");
        System.out.println("Numero compuesto por numeros pares: " + numeroPar);
        System.out.println("Numero compuesto por numeros impares: " + numeroImpar);
    }
}
