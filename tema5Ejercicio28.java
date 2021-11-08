public class tema5Ejercicio28 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero para calcular su factorial: ");
        int numero = Integer.parseInt(System.console().readLine());
        int suma = 1;
        if (numero == 0) {
            System.out.println("El numero factorial es 1");
        } else {
            for (int i = 1; i <= numero; i++) {
                suma *= i;
            }
            System.out.println(suma);
        }

    }
}
