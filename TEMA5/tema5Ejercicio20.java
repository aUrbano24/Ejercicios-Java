import java.util.Scanner;

public class tema5Ejercicio20 {
    public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    char caracter;
    int altura;

    System.out.print("Introduzca el carácter: ");
    caracter = s.nextLine().charAt(0);

    System.out.print("Introduzca la altura: ");
    altura = s.nextInt();

    s.close();
    
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < altura - i; j++) System.out.print(" ");
        
        for (int k = 0; k <= i; k++) {
        if (k == 0 || k == i || i == altura - 1) System.out.print(caracter + " ");
        else System.out.print("  ");
    }  
    System.out.println();
        }
    }
}
