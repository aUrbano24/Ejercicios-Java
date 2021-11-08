public class tema5Ejercicio23 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que permita ir introduciendo una serie indeterminada de
         * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
         * se debe mostrar el total acumulado, el contador de los números introducidos y
         * la media
         */
        int numeroTotal = 0;
        int numerosIntroducidos = 0;

        while (numeroTotal <= 10000) {
            System.out.print("Introduce un numero: ");
            int numero = Integer.parseInt(System.console().readLine());
            numeroTotal += numero;
            numerosIntroducidos++;
        }
        System.out.printf("El numero total es %1s numeros \n", numeroTotal);
        System.out.printf("Has introducido: %1s numeros", numerosIntroducidos);
    }
}
