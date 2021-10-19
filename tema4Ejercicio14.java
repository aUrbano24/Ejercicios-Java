public class tema4Ejercicio14{
  public static void main(String[] args) {
    /*ealiza un programa que diga si un número introducido por teclado es par y/o
    divisible entre 5.*/
  System.out.println("Introduce un número: ");
  int numero = Integer.parseInt(System.console().readLine());
  int resto2 = numero % 2;
  int resto5 = numero % 5;
  if (numero % 2 == 0) {
    System.out.println("El numero es par ");
  }
  else {
    System.out.println("El numero no es par ");
  }
  if (numero % 5 == 0) {
    System.out.println("El numero es divisible entre 5 ");
  }
  else {
    System.out.println("El numero no es divisible entre 5 ");
  }
  
  }
}
