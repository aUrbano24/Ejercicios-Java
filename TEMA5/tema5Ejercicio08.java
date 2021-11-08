public class tema5Ejercicio08 {
    public static void main(String[] args) {
        /*
         * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
         */
        System.out.println("Introduce un numero para mostrar su tabla de multriplicar:");
        int n = Integer.parseInt(System.console().readLine());
        for (int r = 1; r < 11; r++) {
            System.out.println(n + " x " + r + " = " + n * r);
        }

    }
}
