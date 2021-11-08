public class tema5Ejercicio30 {
    public static void main(String[] args) {
        /**
         * Realiza una programa que calcule las horas transcurridas entre dos horas de
         * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
         * El día de la semana se puede pedir como un número (del 1 al 7) o como una
         * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
         * los datos correctamente y que el segundo día es posterior al primero.
         */
        int resultado = 0;
        int resultado2 = 0;
        System.out.print("1- Lunes\n2- Martes\n3- Miercoles\n4- Jueves\n5- Viernes\n6- Sabado\n7- Domingo");
        for (int i = 1; i <= 2; i++) {
            System.out.print("Introduce el dia de la semana del dia " + i + ": (1-7): ");
            int dia = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce una hora (0-23): ");
            int hora = Integer.parseInt(System.console().readLine());
            if ((hora >= 0) && (hora <= 23)) {
                if (i == 1) {
                    resultado = (dia * 24) + hora;
                } else {
                    resultado2 = (dia * 24) + hora;
                }
            } else {
                System.out.println("Has introducido una hora erronea");
            }

        }
        if (resultado2 > resultado) {
            System.out.println("Hay " + ((resultado2 - resultado) / 24) + " dia/s y " + ((resultado2 - resultado) % 24)
                    + " horas de diferencia");
        } else {
            System.out.println("No se puede calcular lo que falta para llegar a un dia anterior.");
        }

    }
}