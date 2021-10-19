public class tema4Ejercicio7{
  public static void main(String[] args) {
  /*Realiza un programa que calcule la media de tres notas.*/
  System.out.println("Introduce la primera nota: ");
  double nota1 = Double.parseDouble(System.console().readLine());
  System.out.println("Introduce la segunda nota: ");
  double nota2 = Double.parseDouble(System.console().readLine());
  System.out.println("Introduce la tercera nota: ");
  double nota3 = Double.parseDouble(System.console().readLine());
  
  double notaMedia = (nota1 + nota2 + nota3)/3;
  System.out.println("Tu nota media es: " + notaMedia);
  
  }
}
