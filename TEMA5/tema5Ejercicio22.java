public class tema5Ejercicio22 {
    public static void main(String[] args) {
        // Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
        System.out.println("Este programa muestra por pantalla todos los numeros primos entre 2 y 100");
        System.out.println("-------------------------------------------------------------------------");
        boolean primo = true;
        for (int i = 2; i<=100;i++) {
            primo = true;
            for (int j = 2;j<i;j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
