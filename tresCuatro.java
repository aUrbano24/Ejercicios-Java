public class tresCuatro{
  public static void main(String[] args) {
    /*Escribe un programa que sume, reste, multiplique y divida dos números
      introducidos por teclado.*/
    System.out.println("Introduce dos numeros por pantalla consecutivamente para realizar sus correspondientes operaciones: ");
    String linea = System.console().readLine();
    String linea2 = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    int segundoNumero = Integer.parseInt(linea2);
    int suma = primerNumero + segundoNumero;
    int resta = primerNumero - segundoNumero;
    int division = primerNumero/segundoNumero;
    int multiplicacion = primerNumero * segundoNumero;
    System.out.println("La suma de "+ primerNumero + " mas " + segundoNumero + " es: " + suma);
    System.out.println("La resta de "+ primerNumero + " menos " + segundoNumero + " es: " + resta);
    System.out.println("La multiplicacion de "+ primerNumero + " por " + segundoNumero + " es: " + multiplicacion);
    System.out.println("La division de "+ primerNumero + " entre " + segundoNumero + " es: " + division);
  }
}
