public class tema5Ejercicio37 {
    public static void main(String[] args) {
        // Realiza un conversor del sistema decimal al sistema de “palotes”.
        System.out.println("Introduce un numero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int volteado = 0;

        while (numeroIntroducido > 0) {
            volteado = (volteado * 10) + (numeroIntroducido % 10);
            numeroIntroducido /= 10;
        }
        while (volteado > 0) {
            int digito = volteado % 10;
            while (digito > 0) {
                digito -= 1;
                System.out.print("|");
            }
            volteado /= 10;
            System.out.print(" - ");
        }

    }
}
