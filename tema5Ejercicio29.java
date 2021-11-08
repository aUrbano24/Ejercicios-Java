public class tema5Ejercicio29 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que muestre por pantalla todos los números enteros
         * positivos menores a uno leído por teclado que no sean divisibles entre otro
         * también leído de igual forma.
         */
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println(
                "Introduce el numero entre el que quieres que no sea divisible el anterior numero introducido: ");
        int Nodivisible = Integer.parseInt(System.console().readLine());

        for (int i = numero; i > 0; i--) {
            if (!(i % Nodivisible == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
