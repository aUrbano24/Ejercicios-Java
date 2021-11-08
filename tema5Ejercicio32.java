public class tema5Ejercicio32 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que, dado un número entero positivo, diga cuáles son y
         * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
         * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
         * admitir números largos.
         */
        System.out.print("Introduce un numero entero positivo: ");
        long n = Integer.parseInt(System.console().readLine());
        int cantidad = 0;
        long total = 0;
        int suma = 0;
        while (n > 0) {
            total = n % 10;
            n = n / 10;
            if (total % 2 == 0) {
                System.out.print(total + " ");
                cantidad++;
                suma += total;
            }
        }
        System.out.println("\nEl total de numeros pares es " + cantidad);
        System.out.println("La suma de los numeros pares es: " + suma);
    }
}
