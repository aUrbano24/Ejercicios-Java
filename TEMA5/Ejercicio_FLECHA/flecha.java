import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        int a;
        System.out.println(
                "PROGRAMA PARA CONSTRUIR UNA FLECHA (ten en cuenta que dependiendo la orientacion de la flecha, tanto la altura como la anchura puede corresponder al eje x y al eje y)");
        do {
            System.out.print("Introduce la altura de la flecha: ");
            h = Integer.parseInt(System.console().readLine());
            if (h <= 0 || h % 2 == 0) {
                System.out.println("Debes introducir un valor impar mayor de 0.");
            }
        } while (h <= 0 || h % 2 == 0);

        do {
            System.out.print("Introduce la anchura de la flecha: ");
            a = Integer.parseInt(System.console().readLine());
            if (a <= 0 || a % 2 == 0) {
                System.out.println("Debes introducir un valor impar mayor de 0.");
            }
        } while (a <= 0 || h % 2 == 0);

        System.out.print("Introduce el caracter: ");
        char c = sc.next().charAt(0);

        System.out.print("En que posicion quieres que aparezca la piramide(contando de derecha a izquierda):  ");
        int posicion = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce la orientación(izquierda, arriba, abajo, derecha): ");
        String orientacion = System.console().readLine();

        switch (orientacion) {
        case "derecha":
            // primera parte
            for (int i = 1; i <= h / 2 + 1; i++) {
                if (i == 1) {
                    for (int j = 1; j <= a - posicion; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(c);
                } else {
                    for (int j = 1; j <= a + i; j++) {
                        System.out.print(c);
                    }
                }
                System.out.println();
            }
            // segunda parte
            for (int i = 1; i <= h / 2; i++) {
                if (i == h / 2) {
                    for (int j = 1; j <= a - posicion; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(c);
                } else {
                    for (int j = 1; j <= a - i; j++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }
            break;

        default:
            System.out.println("No has introducido una orientacion adecuada");
            break;
        }
    }
}
