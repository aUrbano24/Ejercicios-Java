public class tema5Ejercicio9 {
    /*
     * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
     * por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
     * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
     * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando
     * bucles; de esta manera, la única limitación en el número de dígitos la
     * establece el tipo de dato que se utilice (int o long).
     */
    public static void main(String[] args) {
        int digitos = 1;
        System.out.println("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());

        int n = numero;

        while (n >= 10) {
            n /= 10;
            digitos++;
        }
        System.out.println("El numero " + numero + " tiene " + digitos + " digitos ");
    }
}
