public class tema5Ejercicio27 {
    public static void main(String[] args) {
        System.out.print("Introduce el numero hasta el que quieres calcular los multiplos de 3:\n");
        int numero = Integer.parseInt(System.console().readLine());
        int cuenta = 0;
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                cuenta++;
                suma += i;
            }
        }
        System.out.println("\nSe han introducido " + cuenta + " numeros" + "con una suma total de " + suma);

    }
}
