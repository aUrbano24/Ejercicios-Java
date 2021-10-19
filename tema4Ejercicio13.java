public class tema4Ejercicio13{
  public static void main(String[] args) {
  //Escribe un programa que ordene tres números enteros introducidos por teclado.
  System.out.println("Introduce el primer número por pantalla: ");
  int numero1 = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el segundo número por pantalla: ");
  int numero2 = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el tercer número por pantalla: ");
  int numero3 = Integer.parseInt(System.console().readLine());
  
  if ((numero1 > numero2) && (numero1 > numero3)) {
    System.out.println(numero1);
  }
  else {
    if (numero2 > numero3) {
    System.out.println(numero2);
  }
    else { 
       System.out.println(numero3);
    }
  }
  }
}
