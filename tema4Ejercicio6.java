public class tema4Ejercicio6{
  public static void main(String[] args) {
  /*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
  una altura h. Aplica la fórmula t =√2hg siendo g = 9:81m/s*/
  System.out.println("Introduce la altura: ");
  double h = Double.parseDouble(System.console().readLine());
  double operacion = (Math.sqrt(2)*h)/9.81;
  System.out.println("El resultado es: "+operacion);
  }
}
