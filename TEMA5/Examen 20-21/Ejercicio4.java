public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * ] Implemente un programa que "estire" números. El programa debe solicitar al
         * usuario un número entero positivo, que será el número que va a ser estirado.
         * A continuación, debe solicitar al usuario otro número entero positivo, que es
         * "el estiramiento" que va a sufrir. Dicho número indicará las repeticiones que
         * tendrá lugar cada cifra del número original en el número "estirado". El
         * resultado que genere el número no tiene por qué almacenarse en ninguna
         * variable entera ni entera larga; piense que se puede estirar muchísimo. Vea
         * el siguiente ejemplo:
         */
        int numeroIntroducido = 0;
        int estiramiento = 0;
        do {
            System.out.print("Introduzca un numero: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            if (numeroIntroducido == 0) {
                System.out.println("El numero cero no es valido.");
            } else if (numeroIntroducido < 0) {
                System.out.println("No aceptamos numeros negativos, este numero sera utilizado en su forma positiva..");
                numeroIntroducido = Math.abs(numeroIntroducido);
            }

        } while (numeroIntroducido == 0);
        do {
            System.out.print("Introduza el estiramiento: ");
            estiramiento = Integer.parseInt(System.console().readLine());
            if (estiramiento <= 0) {
                System.out.println("No se aceptan numeros negativos ni 0.");
            }
        } while (estiramiento <= 0);

        int volteado = 0;
        int digito = 0;
        int estirado = 0;

        while (numeroIntroducido > 0) {
            volteado = (volteado * 10) + (numeroIntroducido % 10);
            numeroIntroducido /= 10;
        }
        while (volteado > 0) {
            digito = volteado % 10;
            for (int i = 1; i <= estiramiento; i++) {
                estirado *= 10;
                estirado += digito;
            }
            volteado /= 10;
        }
        System.out.println("El numero estirado del numero es " + estirado);

    }
}
