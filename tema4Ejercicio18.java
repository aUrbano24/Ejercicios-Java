public class tema4Ejercicio18{
  public static void main(String[] args) {
     /*Escribe un programa que diga cuál es la primera cifra de un número
 entero introducido por teclado. Se permiten números de hasta 5 cifras.*/

  System.out.println("CALCULO DE LA PRIMERA CIFRA DE UN NUMERO ENTERO. ");
  System.out.println("Introduce el número:  ");
  int numero = Integer.parseInt(System.console().readLine());
  
  if (numero<10) {
    System.out.println("La primera cifra del numero es: " + numero);
     }
    else if ((numero<100) && (numero>10)) {
      int resultado = numero/10;
      System.out.println("La primera cifra del numero es: " + resultado);
   }
   else if (numero<1000) {
      int resultado = numero/100;
      System.out.println("La primera cifra del numero es: " + resultado);
  }
  else if (numero<10000) {
      int resultado = numero/1000;
      System.out.println("La primera cifra del numero es: " + resultado);
  }
}
}
