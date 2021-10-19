public class tresUno{
  public static void main(String[] args) {
    /*Realiza un programa que pida dos números y que luego muestre el resultado
    de su multiplicación.*/
    System.out.println("Introduce dos numeros por pantalla consecutivamente para realizar una multipliación: ");
    String linea = System.console().readLine();
    String linea2 = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    int segundoNumero = Integer.parseInt(linea2);
    int resultado = primerNumero * segundoNumero;
    System.out.println("El resultado de la multiplicación es: " + resultado);
  }
}
