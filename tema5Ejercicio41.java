public class tema5Ejercicio41 {
    public static void main(String[] args) {
        /**
         * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
         * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
         * primero admite números más largos.
         */
        System.out.print("Introduce un numero: ");
        long numeroIntroducido = Integer.parseInt(System.console().readLine());
        long numero = numeroIntroducido;
        long digito = 0;
        int pares = 0;
        int impares = 0;
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0 && digito == 0) {
                pares++;
            } else {
                impares++;
            }
            numero /= 10;
        }
        System.out.println("El numero " + numeroIntroducido + " contiene " + pares + " digitos pares y " + impares
                + " digitos impares.");
    }
}
