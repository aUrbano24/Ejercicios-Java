public class tema5Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la letra U");
        int h = Integer.parseInt(System.console().readLine());

        for (int i = 1; i < h; i++) {
            System.out.print("* ");
            for (int j = 2; j < h; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for (int i = 2; i < h; i++) {
            System.out.print("* ");
        }

    }
}
