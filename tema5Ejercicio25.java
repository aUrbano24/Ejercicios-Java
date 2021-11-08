public class tema5Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        int alreves = 0;

        while (numero > 0) {
            alreves = (alreves * 10) + (numero % 10);
            numero /= 10;
        }
        System.out.println("El numero al revés de " + numero + " es " + alreves);
    }
}
