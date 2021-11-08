public class tema5Ejercicio21 {
    public static void main(String[] args) {
        /* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo */
        int numeroTotal = 0;
        int numeroMayor = 0;
        int impar = 0;
        int cantidadNumeros= 0;
        int numero = 0;
        while (numero>=0) {
            System.out.println("Introduce un numero positivo, para parar de introducir introduce un numero negativo: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero >=0) {
                cantidadNumeros++;
                if (numero % 2 == 0) {
                    if (numero > numeroMayor)
                    numeroMayor = numero;
    
                } else {
                        impar++;
                        numeroTotal += numero;
                    }
            }
            else {
                System.out.println("Has finalizado el bucle de introduccion de numeros.");
                System.out.println("---------------------------------------------------");
            }
        }
        System.out.println("Se han introducido " + cantidadNumeros + " numeros");
        System.out.println("La nota media de los impares es " + numeroTotal/impar);
        System.out.println("El mayor numero par es: " + numeroMayor);

    }
}
