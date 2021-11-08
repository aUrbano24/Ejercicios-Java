public class tema5Ejercicio39 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que pida un número entero positivo por teclado y que
         * muestre a continuación los números desde el 1 al número introducido junto con
         * su factorial.
         */
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = i;
            for (int j = 1; j < i; j++) {
                factorial *= j;
            }
            System.out.println("!" + i + "= " + factorial);
        }
    }
}
