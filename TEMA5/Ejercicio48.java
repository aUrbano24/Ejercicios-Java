public class Ejercicio48 {
    public static void main(String[] args) {
        long num;
        boolean presente = false;
        String digitosPresentes = "";
        String digitosNoPresentes = "";

        System.out.print("Introduzca un número entero: ");
        num = Long.parseLong(System.console().readLine());

        long aux;
        for (int i = 0; i <= 9; i++) {
            aux = num;
            presente = false;

            do {
                if ((int) (aux % 10) == i)
                    presente = true;

                aux /= 10;
            } while (!presente && aux > 0);

            if (presente)
                digitosPresentes += i + " ";
            else
                digitosNoPresentes += i + " ";
        }

        System.out.println("Dígitos que aparecen en el número: " + digitosPresentes);
        System.out.println("Dígitos que no aparecen: " + digitosNoPresentes);
    }
}