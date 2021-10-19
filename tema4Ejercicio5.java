public class tema4Ejercicio5{
  public static void main(String[] args) {
  /*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
    0).*/
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.println("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    double ecuacion = 0-b/a;
    System.out.println("El resultado de la ecuacion es: " + ecuacion);
  }
}
